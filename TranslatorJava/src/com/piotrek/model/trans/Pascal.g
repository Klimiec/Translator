grammar Pascal;

options {output=template;}
scope global { List listA; List listB;}
@header { import org.antlr.stringtemplate.*;}




// -----------------------------------------
// -------- * The Pascal parser * ----------
// -----------------------------------------


program
                        scope { List functions; }
                        @init { $program::functions = new ArrayList();}
  :   programBody 
         -> program(statements={$program::functions})
  ;



programBody 
    :    compoundStatement        {$program::functions.add($compoundStatement.st);}
    ;



compoundStatement
              scope { String name;}
              scope global;
              @init { $global::listA = new ArrayList(); 
                      $global::listB = new ArrayList();}

    :   'program' ID ';'      {$compoundStatement::name=$ID.text;}
         constantDefinitionPart? 
         variableDeclarationPart?    
         statements?         
             -> compound(name={$compoundStatement::name}, locals={$global::listA}, stats={$global::listB})
    ;



constantDefinitionPart
  :
       'const'
       (constantDefinition {$global::listA.add($constantDefinition.st);})*
  ;


constantDefinition
  :   identifierVar '=' INT ';'  
         -> constance(name={$identifierVar.st},value={$INT.text})
  ;



variableDeclarationPart
  :   'var' 
      (variableDeclaration {$global::listA.add($variableDeclaration.st);})*
  ;



variableDeclaration
    :   identifierVar ':' typ';'
          -> variable(type={$typ.st},name={$identifierVar.st})
    ;


identifierVar
    :   ID
          -> {new StringTemplate($ID.text)}
    ;


statements
    :  'begin'
       (variableDeclaration {$global::listA.add($variableDeclaration.st);})*
       (statement {$global::listB.add($statement.st);})*
       'end' '.'? 
    ;


statement
              scope global;
              @init{
                   $global::listA = new ArrayList();
                   $global::listB = new ArrayList();}
    :   repetetiveStatement     
          -> {$repetetiveStatement.st}    
    |   conditionalStatement   
          -> {$conditionalStatement.st}  
    |   expression ';'          
          -> statement(expr={$expression.st})  
    |   statements              
          -> statementList(locals={$global::listA}, stats={$global::listB}) 
    |   assignmentStatement ';' 
          -> {$assignmentStatement.st}  
    |   print                   
          -> {$print.st}  
    |   ';'                     
          -> {new StringTemplate(";")}       
    |   'else'                  
          -> else_statement()
    ;



repetetiveStatement
    : whileStatement     
        -> {$whileStatement.st}  
    | repeatStatement    
        -> {$repeatStatement.st}  
    ;


whileStatement
                        scope global;
                         @init {
                              $global::listA = new ArrayList();
                              $global::listB = new ArrayList();}
    :   'while' wyr=expression 'do' statements          
            -> whileLoop(wyr={$wyr.st},locals={$global::listA}, stats={$global::listB})  
    ;


repeatStatement
                        scope global;
                         @init {
                              $global::listA = new ArrayList();
                              $global::listB = new ArrayList();}
    :   'repeat' statements 'until' przyp=expression    
             -> repeatLoop(przyp={$przyp.st},locals={$global::listA}, stats={$global::listB})
    ;    



conditionalStatement
    : ifStatement   
         -> {$ifStatement.st} 
    ;


ifStatement
                        scope global;
                         @init {
                              $global::listA = new ArrayList();
                              $global::listB = new ArrayList();}
    :  
       'if'  wk=expression 'then' 
       statements 
           -> if_statement(wk={$wk.st},locals={$global::listA}, stats={$global::listB})         
    ;


assignmentStatement
    :   
        ID ':=' expression 
            -> assign(lhs={$ID.text}, rhs={$expression.st})
    ;






expression:   a=expressionPart
        (   (  '=' b=expressionPart 
                  -> equals(left={$a.st},right={$b.st})
             |  '<' b=expressionPart     
                  -> lessThan(left={$a.st},right={$b.st})
             |  '>' b=expressionPart   
                  -> moreThan(left={$a.st},right={$b.st})
             | '>=' b=expressionPart   
                  -> moreEqualThan(left={$a.st},right={$b.st})
             | '<=' b=expressionPart   
                  -> lessEqualThan(left={$a.st},right={$b.st})
             | '<>' b=expressionPart   
                  -> notEquals(left={$a.st},right={$b.st})
            )
        |   -> {$a.st} // else just aexpr
        )
    ;

expressionPart
    :   (a=podst -> {$a.st})
        ( '+' b=podst 
            -> add(left={$expressionPart.st}, right={$b.st}) 
        | '*' b=podst 
            -> mul(left={$expressionPart.st}, right={$b.st})
        | '-' b=podst 
            -> sub(left={$expressionPart.st}, right={$b.st})
        | '/' b=podst 
            -> div(left={$expressionPart.st}, right={$b.st})
        | 'mod' b=podst 
            -> mod(left={$expressionPart.st}, right={$b.st})
        )*
    ;

podst
    : ID 
        -> refVar(id={$ID.text})
    | INT 
        -> iconst(value={$INT.text})
    | REAL 
        -> iconst(value={$REAL.text})
    | '(' expression ')' 
        -> {$expression.st}
    ; 



print
    :
      ('writeln' | 'write') '(' identifierVar? ')' ';'
          -> writing_n(txt={$identifierVar.text})
             
    ;



typ
    :   'integer'   
          -> type_int()
    |   'char'      
          -> type_char()
    |   'longint'   
          -> type_longint()
    |   'string'   
          -> type_string()
    |   'real'      
          -> type_real()
    |   'double'    
          -> type_double()
    ;




// -----------------------------------------
//  --------  The Pascal lexer   ----------
// -----------------------------------------

ID  
    :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

REAL 
  :   INT '.' INT
    ;

COMMA
  :   ','   
  ;

INT 
  :   ('0'..'9')+
  ;

WS  
    :   (' ' | '\t' | '\r' | '\n')+ {$channel=HIDDEN;}
    ;    


