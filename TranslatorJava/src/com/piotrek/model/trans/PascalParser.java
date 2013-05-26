package com.piotrek.model.trans;

// $ANTLR 3.4 Pascal.g 2013-05-22 18:21:50
 import org.antlr.stringtemplate.*;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class PascalParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "ID", "INT", "REAL", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'.'", "'/'", "':'", "':='", "';'", "'<'", "'<='", "'<>'", "'='", "'>'", "'>='", "'begin'", "'char'", "'const'", "'do'", "'double'", "'else'", "'end'", "'if'", "'integer'", "'longint'", "'mod'", "'program'", "'real'", "'repeat'", "'string'", "'then'", "'until'", "'var'", "'while'", "'write'", "'writeln'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int COMMA=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int REAL=7;
    public static final int WS=8;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators

    protected static class global_scope {
        List listA;
        List listB;
    }
    protected Stack global_stack = new Stack();



    public PascalParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public PascalParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("PascalParserTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return PascalParser.tokenNames; }
    public String getGrammarFileName() { return "Pascal.g"; }


    protected static class program_scope {
        List functions;
    }
    protected Stack program_stack = new Stack();


    public static class program_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "program"
    // Pascal.g:15:1: program : programBody -> program(statements=$program::functions);
    public final PascalParser.program_return program() throws RecognitionException {
        program_stack.push(new program_scope());
        PascalParser.program_return retval = new PascalParser.program_return();
        retval.start = input.LT(1);


         ((program_scope)program_stack.peek()).functions = new ArrayList();
        try {
            // Pascal.g:18:3: ( programBody -> program(statements=$program::functions))
            // Pascal.g:18:7: programBody
            {
            pushFollow(FOLLOW_programBody_in_program98);
            programBody();

            state._fsp--;


            // TEMPLATE REWRITE
            // 19:10: -> program(statements=$program::functions)
            {
                retval.st = templateLib.getInstanceOf("program",new STAttrMap().put("statements", ((program_scope)program_stack.peek()).functions));
            }



            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            program_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class programBody_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "programBody"
    // Pascal.g:24:1: programBody : compoundStatement ;
    public final PascalParser.programBody_return programBody() throws RecognitionException {
        PascalParser.programBody_return retval = new PascalParser.programBody_return();
        retval.start = input.LT(1);


        PascalParser.compoundStatement_return compoundStatement1 =null;


        try {
            // Pascal.g:25:5: ( compoundStatement )
            // Pascal.g:25:10: compoundStatement
            {
            pushFollow(FOLLOW_compoundStatement_in_programBody138);
            compoundStatement1=compoundStatement();

            state._fsp--;


            ((program_scope)program_stack.peek()).functions.add((compoundStatement1!=null?compoundStatement1.st:null));

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "programBody"


    protected static class compoundStatement_scope {
        String name;
    }
    protected Stack compoundStatement_stack = new Stack();


    public static class compoundStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "compoundStatement"
    // Pascal.g:30:1: compoundStatement : 'program' ID ';' ( constantDefinitionPart )? ( variableDeclarationPart )? ( statements )? -> compound(name=$compoundStatement::namelocals=$global::listAstats=$global::listB);
    public final PascalParser.compoundStatement_return compoundStatement() throws RecognitionException {
        global_stack.push(new global_scope());
        compoundStatement_stack.push(new compoundStatement_scope());
        PascalParser.compoundStatement_return retval = new PascalParser.compoundStatement_return();
        retval.start = input.LT(1);


        Token ID2=null;

         ((global_scope)global_stack.peek()).listA = new ArrayList(); 
                              ((global_scope)global_stack.peek()).listB = new ArrayList();
        try {
            // Pascal.g:36:5: ( 'program' ID ';' ( constantDefinitionPart )? ( variableDeclarationPart )? ( statements )? -> compound(name=$compoundStatement::namelocals=$global::listAstats=$global::listB))
            // Pascal.g:36:9: 'program' ID ';' ( constantDefinitionPart )? ( variableDeclarationPart )? ( statements )?
            {
            match(input,36,FOLLOW_36_in_compoundStatement225); 

            ID2=(Token)match(input,ID,FOLLOW_ID_in_compoundStatement227); 

            match(input,18,FOLLOW_18_in_compoundStatement229); 

            ((compoundStatement_scope)compoundStatement_stack.peek()).name =(ID2!=null?ID2.getText():null);

            // Pascal.g:37:10: ( constantDefinitionPart )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Pascal.g:37:10: constantDefinitionPart
                    {
                    pushFollow(FOLLOW_constantDefinitionPart_in_compoundStatement247);
                    constantDefinitionPart();

                    state._fsp--;


                    }
                    break;

            }


            // Pascal.g:38:10: ( variableDeclarationPart )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==42) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Pascal.g:38:10: variableDeclarationPart
                    {
                    pushFollow(FOLLOW_variableDeclarationPart_in_compoundStatement260);
                    variableDeclarationPart();

                    state._fsp--;


                    }
                    break;

            }


            // Pascal.g:39:10: ( statements )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Pascal.g:39:10: statements
                    {
                    pushFollow(FOLLOW_statements_in_compoundStatement276);
                    statements();

                    state._fsp--;


                    }
                    break;

            }


            // TEMPLATE REWRITE
            // 40:14: -> compound(name=$compoundStatement::namelocals=$global::listAstats=$global::listB)
            {
                retval.st = templateLib.getInstanceOf("compound",new STAttrMap().put("name", ((compoundStatement_scope)compoundStatement_stack.peek()).name).put("locals", ((global_scope)global_stack.peek()).listA).put("stats", ((global_scope)global_stack.peek()).listB));
            }



            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            global_stack.pop();
            compoundStatement_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "compoundStatement"


    public static class constantDefinitionPart_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constantDefinitionPart"
    // Pascal.g:45:1: constantDefinitionPart : 'const' ( constantDefinition )* ;
    public final PascalParser.constantDefinitionPart_return constantDefinitionPart() throws RecognitionException {
        PascalParser.constantDefinitionPart_return retval = new PascalParser.constantDefinitionPart_return();
        retval.start = input.LT(1);


        PascalParser.constantDefinition_return constantDefinition3 =null;


        try {
            // Pascal.g:46:3: ( 'const' ( constantDefinition )* )
            // Pascal.g:47:8: 'const' ( constantDefinition )*
            {
            match(input,27,FOLLOW_27_in_constantDefinitionPart342); 

            // Pascal.g:48:8: ( constantDefinition )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Pascal.g:48:9: constantDefinition
            	    {
            	    pushFollow(FOLLOW_constantDefinition_in_constantDefinitionPart352);
            	    constantDefinition3=constantDefinition();

            	    state._fsp--;


            	    ((global_scope)global_stack.peek()).listA.add((constantDefinition3!=null?constantDefinition3.st:null));

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constantDefinitionPart"


    public static class constantDefinition_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constantDefinition"
    // Pascal.g:52:1: constantDefinition : identifierVar '=' INT ';' -> constance(name=$identifierVar.stvalue=$INT.text);
    public final PascalParser.constantDefinition_return constantDefinition() throws RecognitionException {
        PascalParser.constantDefinition_return retval = new PascalParser.constantDefinition_return();
        retval.start = input.LT(1);


        Token INT5=null;
        PascalParser.identifierVar_return identifierVar4 =null;


        try {
            // Pascal.g:53:3: ( identifierVar '=' INT ';' -> constance(name=$identifierVar.stvalue=$INT.text))
            // Pascal.g:53:7: identifierVar '=' INT ';'
            {
            pushFollow(FOLLOW_identifierVar_in_constantDefinition372);
            identifierVar4=identifierVar();

            state._fsp--;


            match(input,22,FOLLOW_22_in_constantDefinition374); 

            INT5=(Token)match(input,INT,FOLLOW_INT_in_constantDefinition376); 

            match(input,18,FOLLOW_18_in_constantDefinition378); 

            // TEMPLATE REWRITE
            // 54:10: -> constance(name=$identifierVar.stvalue=$INT.text)
            {
                retval.st = templateLib.getInstanceOf("constance",new STAttrMap().put("name", (identifierVar4!=null?identifierVar4.st:null)).put("value", (INT5!=null?INT5.getText():null)));
            }



            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constantDefinition"


    public static class variableDeclarationPart_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "variableDeclarationPart"
    // Pascal.g:59:1: variableDeclarationPart : 'var' ( variableDeclaration )* ;
    public final PascalParser.variableDeclarationPart_return variableDeclarationPart() throws RecognitionException {
        PascalParser.variableDeclarationPart_return retval = new PascalParser.variableDeclarationPart_return();
        retval.start = input.LT(1);


        PascalParser.variableDeclaration_return variableDeclaration6 =null;


        try {
            // Pascal.g:60:3: ( 'var' ( variableDeclaration )* )
            // Pascal.g:60:7: 'var' ( variableDeclaration )*
            {
            match(input,42,FOLLOW_42_in_variableDeclarationPart419); 

            // Pascal.g:61:7: ( variableDeclaration )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Pascal.g:61:8: variableDeclaration
            	    {
            	    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationPart429);
            	    variableDeclaration6=variableDeclaration();

            	    state._fsp--;


            	    ((global_scope)global_stack.peek()).listA.add((variableDeclaration6!=null?variableDeclaration6.st:null));

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variableDeclarationPart"


    public static class variableDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "variableDeclaration"
    // Pascal.g:66:1: variableDeclaration : identifierVar ':' typ ';' -> variable(type=$typ.stname=$identifierVar.st);
    public final PascalParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        PascalParser.variableDeclaration_return retval = new PascalParser.variableDeclaration_return();
        retval.start = input.LT(1);


        PascalParser.typ_return typ7 =null;

        PascalParser.identifierVar_return identifierVar8 =null;


        try {
            // Pascal.g:67:5: ( identifierVar ':' typ ';' -> variable(type=$typ.stname=$identifierVar.st))
            // Pascal.g:67:9: identifierVar ':' typ ';'
            {
            pushFollow(FOLLOW_identifierVar_in_variableDeclaration452);
            identifierVar8=identifierVar();

            state._fsp--;


            match(input,16,FOLLOW_16_in_variableDeclaration454); 

            pushFollow(FOLLOW_typ_in_variableDeclaration456);
            typ7=typ();

            state._fsp--;


            match(input,18,FOLLOW_18_in_variableDeclaration457); 

            // TEMPLATE REWRITE
            // 68:11: -> variable(type=$typ.stname=$identifierVar.st)
            {
                retval.st = templateLib.getInstanceOf("variable",new STAttrMap().put("type", (typ7!=null?typ7.st:null)).put("name", (identifierVar8!=null?identifierVar8.st:null)));
            }



            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"


    public static class identifierVar_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "identifierVar"
    // Pascal.g:72:1: identifierVar : ID -> {new StringTemplate($ID.text)};
    public final PascalParser.identifierVar_return identifierVar() throws RecognitionException {
        PascalParser.identifierVar_return retval = new PascalParser.identifierVar_return();
        retval.start = input.LT(1);


        Token ID9=null;

        try {
            // Pascal.g:73:5: ( ID -> {new StringTemplate($ID.text)})
            // Pascal.g:73:9: ID
            {
            ID9=(Token)match(input,ID,FOLLOW_ID_in_identifierVar500); 

            // TEMPLATE REWRITE
            // 74:11: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID9!=null?ID9.getText():null));
            }



            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifierVar"


    public static class statements_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "statements"
    // Pascal.g:78:1: statements : 'begin' ( variableDeclaration )* ( statement )* 'end' ( '.' )? ;
    public final PascalParser.statements_return statements() throws RecognitionException {
        PascalParser.statements_return retval = new PascalParser.statements_return();
        retval.start = input.LT(1);


        PascalParser.variableDeclaration_return variableDeclaration10 =null;

        PascalParser.statement_return statement11 =null;


        try {
            // Pascal.g:79:5: ( 'begin' ( variableDeclaration )* ( statement )* 'end' ( '.' )? )
            // Pascal.g:79:8: 'begin' ( variableDeclaration )* ( statement )* 'end' ( '.' )?
            {
            match(input,25,FOLLOW_25_in_statements533); 

            // Pascal.g:80:8: ( variableDeclaration )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ID) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==16) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // Pascal.g:80:9: variableDeclaration
            	    {
            	    pushFollow(FOLLOW_variableDeclaration_in_statements543);
            	    variableDeclaration10=variableDeclaration();

            	    state._fsp--;


            	    ((global_scope)global_stack.peek()).listA.add((variableDeclaration10!=null?variableDeclaration10.st:null));

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // Pascal.g:81:8: ( statement )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= ID && LA7_0 <= REAL)||LA7_0==9||LA7_0==18||LA7_0==25||LA7_0==30||LA7_0==32||LA7_0==38||(LA7_0 >= 43 && LA7_0 <= 45)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Pascal.g:81:9: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements557);
            	    statement11=statement();

            	    state._fsp--;


            	    ((global_scope)global_stack.peek()).listB.add((statement11!=null?statement11.st:null));

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,31,FOLLOW_31_in_statements570); 

            // Pascal.g:82:14: ( '.' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Pascal.g:82:14: '.'
                    {
                    match(input,14,FOLLOW_14_in_statements572); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statements"


    public static class statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "statement"
    // Pascal.g:86:1: statement : ( repetetiveStatement -> {$repetetiveStatement.st}| conditionalStatement -> {$conditionalStatement.st}| expression ';' -> statement(expr=$expression.st)| statements -> statementList(locals=$global::listAstats=$global::listB)| assignmentStatement ';' -> {$assignmentStatement.st}| print -> {$print.st}| ';' -> {new StringTemplate(\";\")}| 'else' -> else_statement();
    public final PascalParser.statement_return statement() throws RecognitionException {
        global_stack.push(new global_scope());

        PascalParser.statement_return retval = new PascalParser.statement_return();
        retval.start = input.LT(1);


        PascalParser.repetetiveStatement_return repetetiveStatement12 =null;

        PascalParser.conditionalStatement_return conditionalStatement13 =null;

        PascalParser.expression_return expression14 =null;

        PascalParser.assignmentStatement_return assignmentStatement15 =null;

        PascalParser.print_return print16 =null;



                           ((global_scope)global_stack.peek()).listA = new ArrayList();
                           ((global_scope)global_stack.peek()).listB = new ArrayList();
        try {
            // Pascal.g:91:5: ( repetetiveStatement -> {$repetetiveStatement.st}| conditionalStatement -> {$conditionalStatement.st}| expression ';' -> statement(expr=$expression.st)| statements -> statementList(locals=$global::listAstats=$global::listB)| assignmentStatement ';' -> {$assignmentStatement.st}| print -> {$print.st}| ';' -> {new StringTemplate(\";\")}| 'else' -> else_statement()
            int alt9=8;
            switch ( input.LA(1) ) {
            case 38:
            case 43:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case ID:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==17) ) {
                    alt9=5;
                }
                else if ( ((LA9_3 >= 11 && LA9_3 <= 13)||LA9_3==15||(LA9_3 >= 18 && LA9_3 <= 24)||LA9_3==35) ) {
                    alt9=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;

                }
                }
                break;
            case INT:
            case REAL:
            case 9:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            case 44:
            case 45:
                {
                alt9=6;
                }
                break;
            case 18:
                {
                alt9=7;
                }
                break;
            case 30:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // Pascal.g:91:9: repetetiveStatement
                    {
                    pushFollow(FOLLOW_repetetiveStatement_in_statement631);
                    repetetiveStatement12=repetetiveStatement();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 92:11: -> {$repetetiveStatement.st}
                    {
                        retval.st = (repetetiveStatement12!=null?repetetiveStatement12.st:null);
                    }



                    }
                    break;
                case 2 :
                    // Pascal.g:93:9: conditionalStatement
                    {
                    pushFollow(FOLLOW_conditionalStatement_in_statement664);
                    conditionalStatement13=conditionalStatement();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 94:11: -> {$conditionalStatement.st}
                    {
                        retval.st = (conditionalStatement13!=null?conditionalStatement13.st:null);
                    }



                    }
                    break;
                case 3 :
                    // Pascal.g:95:9: expression ';'
                    {
                    pushFollow(FOLLOW_expression_in_statement693);
                    expression14=expression();

                    state._fsp--;


                    match(input,18,FOLLOW_18_in_statement695); 

                    // TEMPLATE REWRITE
                    // 96:11: -> statement(expr=$expression.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("expr", (expression14!=null?expression14.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // Pascal.g:97:9: statements
                    {
                    pushFollow(FOLLOW_statements_in_statement736);
                    statements();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 98:11: -> statementList(locals=$global::listAstats=$global::listB)
                    {
                        retval.st = templateLib.getInstanceOf("statementList",new STAttrMap().put("locals", ((global_scope)global_stack.peek()).listA).put("stats", ((global_scope)global_stack.peek()).listB));
                    }



                    }
                    break;
                case 5 :
                    // Pascal.g:99:9: assignmentStatement ';'
                    {
                    pushFollow(FOLLOW_assignmentStatement_in_statement785);
                    assignmentStatement15=assignmentStatement();

                    state._fsp--;


                    match(input,18,FOLLOW_18_in_statement787); 

                    // TEMPLATE REWRITE
                    // 100:11: -> {$assignmentStatement.st}
                    {
                        retval.st = (assignmentStatement15!=null?assignmentStatement15.st:null);
                    }



                    }
                    break;
                case 6 :
                    // Pascal.g:101:9: print
                    {
                    pushFollow(FOLLOW_print_in_statement814);
                    print16=print();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 102:11: -> {$print.st}
                    {
                        retval.st = (print16!=null?print16.st:null);
                    }



                    }
                    break;
                case 7 :
                    // Pascal.g:103:9: ';'
                    {
                    match(input,18,FOLLOW_18_in_statement859); 

                    // TEMPLATE REWRITE
                    // 104:11: -> {new StringTemplate(\";\")}
                    {
                        retval.st = new StringTemplate(";");
                    }



                    }
                    break;
                case 8 :
                    // Pascal.g:105:9: 'else'
                    {
                    match(input,30,FOLLOW_30_in_statement911); 

                    // TEMPLATE REWRITE
                    // 106:11: -> else_statement(
                    {
                        retval.st = templateLib.getInstanceOf("else_statement");
                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            global_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class repetetiveStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "repetetiveStatement"
    // Pascal.g:111:1: repetetiveStatement : ( whileStatement -> {$whileStatement.st}| repeatStatement -> {$repeatStatement.st});
    public final PascalParser.repetetiveStatement_return repetetiveStatement() throws RecognitionException {
        PascalParser.repetetiveStatement_return retval = new PascalParser.repetetiveStatement_return();
        retval.start = input.LT(1);


        PascalParser.whileStatement_return whileStatement17 =null;

        PascalParser.repeatStatement_return repeatStatement18 =null;


        try {
            // Pascal.g:112:5: ( whileStatement -> {$whileStatement.st}| repeatStatement -> {$repeatStatement.st})
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            else if ( (LA10_0==38) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // Pascal.g:112:7: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_repetetiveStatement964);
                    whileStatement17=whileStatement();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 113:9: -> {$whileStatement.st}
                    {
                        retval.st = (whileStatement17!=null?whileStatement17.st:null);
                    }



                    }
                    break;
                case 2 :
                    // Pascal.g:114:7: repeatStatement
                    {
                    pushFollow(FOLLOW_repeatStatement_in_repetetiveStatement991);
                    repeatStatement18=repeatStatement();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 115:9: -> {$repeatStatement.st}
                    {
                        retval.st = (repeatStatement18!=null?repeatStatement18.st:null);
                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "repetetiveStatement"


    public static class whileStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "whileStatement"
    // Pascal.g:119:1: whileStatement : 'while' wyr= expression 'do' statements -> whileLoop(wyr=$wyr.stlocals=$global::listAstats=$global::listB);
    public final PascalParser.whileStatement_return whileStatement() throws RecognitionException {
        global_stack.push(new global_scope());

        PascalParser.whileStatement_return retval = new PascalParser.whileStatement_return();
        retval.start = input.LT(1);


        PascalParser.expression_return wyr =null;



                                      ((global_scope)global_stack.peek()).listA = new ArrayList();
                                      ((global_scope)global_stack.peek()).listB = new ArrayList();
        try {
            // Pascal.g:124:5: ( 'while' wyr= expression 'do' statements -> whileLoop(wyr=$wyr.stlocals=$global::listAstats=$global::listB))
            // Pascal.g:124:9: 'while' wyr= expression 'do' statements
            {
            match(input,43,FOLLOW_43_in_whileStatement1088); 

            pushFollow(FOLLOW_expression_in_whileStatement1092);
            wyr=expression();

            state._fsp--;


            match(input,28,FOLLOW_28_in_whileStatement1094); 

            pushFollow(FOLLOW_statements_in_whileStatement1096);
            statements();

            state._fsp--;


            // TEMPLATE REWRITE
            // 125:13: -> whileLoop(wyr=$wyr.stlocals=$global::listAstats=$global::listB)
            {
                retval.st = templateLib.getInstanceOf("whileLoop",new STAttrMap().put("wyr", (wyr!=null?wyr.st:null)).put("locals", ((global_scope)global_stack.peek()).listA).put("stats", ((global_scope)global_stack.peek()).listB));
            }



            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            global_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "whileStatement"


    public static class repeatStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "repeatStatement"
    // Pascal.g:129:1: repeatStatement : 'repeat' statements 'until' przyp= expression -> repeatLoop(przyp=$przyp.stlocals=$global::listAstats=$global::listB);
    public final PascalParser.repeatStatement_return repeatStatement() throws RecognitionException {
        global_stack.push(new global_scope());

        PascalParser.repeatStatement_return retval = new PascalParser.repeatStatement_return();
        retval.start = input.LT(1);


        PascalParser.expression_return przyp =null;



                                      ((global_scope)global_stack.peek()).listA = new ArrayList();
                                      ((global_scope)global_stack.peek()).listB = new ArrayList();
        try {
            // Pascal.g:134:5: ( 'repeat' statements 'until' przyp= expression -> repeatLoop(przyp=$przyp.stlocals=$global::listAstats=$global::listB))
            // Pascal.g:134:9: 'repeat' statements 'until' przyp= expression
            {
            match(input,38,FOLLOW_38_in_repeatStatement1217); 

            pushFollow(FOLLOW_statements_in_repeatStatement1219);
            statements();

            state._fsp--;


            match(input,41,FOLLOW_41_in_repeatStatement1221); 

            pushFollow(FOLLOW_expression_in_repeatStatement1225);
            przyp=expression();

            state._fsp--;


            // TEMPLATE REWRITE
            // 135:14: -> repeatLoop(przyp=$przyp.stlocals=$global::listAstats=$global::listB)
            {
                retval.st = templateLib.getInstanceOf("repeatLoop",new STAttrMap().put("przyp", (przyp!=null?przyp.st:null)).put("locals", ((global_scope)global_stack.peek()).listA).put("stats", ((global_scope)global_stack.peek()).listB));
            }



            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            global_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "repeatStatement"


    public static class conditionalStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "conditionalStatement"
    // Pascal.g:140:1: conditionalStatement : ifStatement -> {$ifStatement.st};
    public final PascalParser.conditionalStatement_return conditionalStatement() throws RecognitionException {
        PascalParser.conditionalStatement_return retval = new PascalParser.conditionalStatement_return();
        retval.start = input.LT(1);


        PascalParser.ifStatement_return ifStatement19 =null;


        try {
            // Pascal.g:141:5: ( ifStatement -> {$ifStatement.st})
            // Pascal.g:141:7: ifStatement
            {
            pushFollow(FOLLOW_ifStatement_in_conditionalStatement1283);
            ifStatement19=ifStatement();

            state._fsp--;


            // TEMPLATE REWRITE
            // 142:10: -> {$ifStatement.st}
            {
                retval.st = (ifStatement19!=null?ifStatement19.st:null);
            }



            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionalStatement"


    public static class ifStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "ifStatement"
    // Pascal.g:146:1: ifStatement : 'if' wk= expression 'then' statements -> if_statement(wk=$wk.stlocals=$global::listAstats=$global::listB);
    public final PascalParser.ifStatement_return ifStatement() throws RecognitionException {
        global_stack.push(new global_scope());

        PascalParser.ifStatement_return retval = new PascalParser.ifStatement_return();
        retval.start = input.LT(1);


        PascalParser.expression_return wk =null;



                                      ((global_scope)global_stack.peek()).listA = new ArrayList();
                                      ((global_scope)global_stack.peek()).listB = new ArrayList();
        try {
            // Pascal.g:151:5: ( 'if' wk= expression 'then' statements -> if_statement(wk=$wk.stlocals=$global::listAstats=$global::listB))
            // Pascal.g:152:8: 'if' wk= expression 'then' statements
            {
            match(input,32,FOLLOW_32_in_ifStatement1386); 

            pushFollow(FOLLOW_expression_in_ifStatement1391);
            wk=expression();

            state._fsp--;


            match(input,40,FOLLOW_40_in_ifStatement1393); 

            pushFollow(FOLLOW_statements_in_ifStatement1403);
            statements();

            state._fsp--;


            // TEMPLATE REWRITE
            // 154:12: -> if_statement(wk=$wk.stlocals=$global::listAstats=$global::listB)
            {
                retval.st = templateLib.getInstanceOf("if_statement",new STAttrMap().put("wk", (wk!=null?wk.st:null)).put("locals", ((global_scope)global_stack.peek()).listA).put("stats", ((global_scope)global_stack.peek()).listB));
            }



            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            global_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "ifStatement"


    public static class assignmentStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "assignmentStatement"
    // Pascal.g:158:1: assignmentStatement : ID ':=' expression -> assign(lhs=$ID.textrhs=$expression.st);
    public final PascalParser.assignmentStatement_return assignmentStatement() throws RecognitionException {
        PascalParser.assignmentStatement_return retval = new PascalParser.assignmentStatement_return();
        retval.start = input.LT(1);


        Token ID20=null;
        PascalParser.expression_return expression21 =null;


        try {
            // Pascal.g:159:5: ( ID ':=' expression -> assign(lhs=$ID.textrhs=$expression.st))
            // Pascal.g:160:9: ID ':=' expression
            {
            ID20=(Token)match(input,ID,FOLLOW_ID_in_assignmentStatement1471); 

            match(input,17,FOLLOW_17_in_assignmentStatement1473); 

            pushFollow(FOLLOW_expression_in_assignmentStatement1475);
            expression21=expression();

            state._fsp--;


            // TEMPLATE REWRITE
            // 161:13: -> assign(lhs=$ID.textrhs=$expression.st)
            {
                retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("lhs", (ID20!=null?ID20.getText():null)).put("rhs", (expression21!=null?expression21.st:null)));
            }



            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignmentStatement"


    public static class expression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "expression"
    // Pascal.g:169:1: expression : a= expressionPart ( ( '=' b= expressionPart -> equals(left=$a.stright=$b.st)| '<' b= expressionPart -> lessThan(left=$a.stright=$b.st)| '>' b= expressionPart -> moreThan(left=$a.stright=$b.st)| '>=' b= expressionPart -> moreEqualThan(left=$a.stright=$b.st)| '<=' b= expressionPart -> lessEqualThan(left=$a.stright=$b.st)| '<>' b= expressionPart -> notEquals(left=$a.stright=$b.st)) | -> {$a.st}) ;
    public final PascalParser.expression_return expression() throws RecognitionException {
        PascalParser.expression_return retval = new PascalParser.expression_return();
        retval.start = input.LT(1);


        PascalParser.expressionPart_return a =null;

        PascalParser.expressionPart_return b =null;


        try {
            // Pascal.g:169:11: (a= expressionPart ( ( '=' b= expressionPart -> equals(left=$a.stright=$b.st)| '<' b= expressionPart -> lessThan(left=$a.stright=$b.st)| '>' b= expressionPart -> moreThan(left=$a.stright=$b.st)| '>=' b= expressionPart -> moreEqualThan(left=$a.stright=$b.st)| '<=' b= expressionPart -> lessEqualThan(left=$a.stright=$b.st)| '<>' b= expressionPart -> notEquals(left=$a.stright=$b.st)) | -> {$a.st}) )
            // Pascal.g:169:15: a= expressionPart ( ( '=' b= expressionPart -> equals(left=$a.stright=$b.st)| '<' b= expressionPart -> lessThan(left=$a.stright=$b.st)| '>' b= expressionPart -> moreThan(left=$a.stright=$b.st)| '>=' b= expressionPart -> moreEqualThan(left=$a.stright=$b.st)| '<=' b= expressionPart -> lessEqualThan(left=$a.stright=$b.st)| '<>' b= expressionPart -> notEquals(left=$a.stright=$b.st)) | -> {$a.st})
            {
            pushFollow(FOLLOW_expressionPart_in_expression1523);
            a=expressionPart();

            state._fsp--;


            // Pascal.g:170:9: ( ( '=' b= expressionPart -> equals(left=$a.stright=$b.st)| '<' b= expressionPart -> lessThan(left=$a.stright=$b.st)| '>' b= expressionPart -> moreThan(left=$a.stright=$b.st)| '>=' b= expressionPart -> moreEqualThan(left=$a.stright=$b.st)| '<=' b= expressionPart -> lessEqualThan(left=$a.stright=$b.st)| '<>' b= expressionPart -> notEquals(left=$a.stright=$b.st)) | -> {$a.st})
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0 >= 19 && LA12_0 <= 24)) ) {
                alt12=1;
            }
            else if ( ((LA12_0 >= ID && LA12_0 <= REAL)||(LA12_0 >= 9 && LA12_0 <= 10)||LA12_0==18||LA12_0==25||LA12_0==28||(LA12_0 >= 30 && LA12_0 <= 32)||LA12_0==38||LA12_0==40||(LA12_0 >= 43 && LA12_0 <= 45)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // Pascal.g:170:13: ( '=' b= expressionPart -> equals(left=$a.stright=$b.st)| '<' b= expressionPart -> lessThan(left=$a.stright=$b.st)| '>' b= expressionPart -> moreThan(left=$a.stright=$b.st)| '>=' b= expressionPart -> moreEqualThan(left=$a.stright=$b.st)| '<=' b= expressionPart -> lessEqualThan(left=$a.stright=$b.st)| '<>' b= expressionPart -> notEquals(left=$a.stright=$b.st))
                    {
                    // Pascal.g:170:13: ( '=' b= expressionPart -> equals(left=$a.stright=$b.st)| '<' b= expressionPart -> lessThan(left=$a.stright=$b.st)| '>' b= expressionPart -> moreThan(left=$a.stright=$b.st)| '>=' b= expressionPart -> moreEqualThan(left=$a.stright=$b.st)| '<=' b= expressionPart -> lessEqualThan(left=$a.stright=$b.st)| '<>' b= expressionPart -> notEquals(left=$a.stright=$b.st))
                    int alt11=6;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt11=1;
                        }
                        break;
                    case 19:
                        {
                        alt11=2;
                        }
                        break;
                    case 23:
                        {
                        alt11=3;
                        }
                        break;
                    case 24:
                        {
                        alt11=4;
                        }
                        break;
                    case 20:
                        {
                        alt11=5;
                        }
                        break;
                    case 21:
                        {
                        alt11=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;

                    }

                    switch (alt11) {
                        case 1 :
                            // Pascal.g:170:16: '=' b= expressionPart
                            {
                            match(input,22,FOLLOW_22_in_expression1540); 

                            pushFollow(FOLLOW_expressionPart_in_expression1544);
                            b=expressionPart();

                            state._fsp--;


                            // TEMPLATE REWRITE
                            // 171:19: -> equals(left=$a.stright=$b.st)
                            {
                                retval.st = templateLib.getInstanceOf("equals",new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                            }



                            }
                            break;
                        case 2 :
                            // Pascal.g:172:17: '<' b= expressionPart
                            {
                            match(input,19,FOLLOW_19_in_expression1594); 

                            pushFollow(FOLLOW_expressionPart_in_expression1598);
                            b=expressionPart();

                            state._fsp--;


                            // TEMPLATE REWRITE
                            // 173:19: -> lessThan(left=$a.stright=$b.st)
                            {
                                retval.st = templateLib.getInstanceOf("lessThan",new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                            }



                            }
                            break;
                        case 3 :
                            // Pascal.g:174:17: '>' b= expressionPart
                            {
                            match(input,23,FOLLOW_23_in_expression1652); 

                            pushFollow(FOLLOW_expressionPart_in_expression1656);
                            b=expressionPart();

                            state._fsp--;


                            // TEMPLATE REWRITE
                            // 175:19: -> moreThan(left=$a.stright=$b.st)
                            {
                                retval.st = templateLib.getInstanceOf("moreThan",new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                            }



                            }
                            break;
                        case 4 :
                            // Pascal.g:176:16: '>=' b= expressionPart
                            {
                            match(input,24,FOLLOW_24_in_expression1707); 

                            pushFollow(FOLLOW_expressionPart_in_expression1711);
                            b=expressionPart();

                            state._fsp--;


                            // TEMPLATE REWRITE
                            // 177:19: -> moreEqualThan(left=$a.stright=$b.st)
                            {
                                retval.st = templateLib.getInstanceOf("moreEqualThan",new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                            }



                            }
                            break;
                        case 5 :
                            // Pascal.g:178:16: '<=' b= expressionPart
                            {
                            match(input,20,FOLLOW_20_in_expression1762); 

                            pushFollow(FOLLOW_expressionPart_in_expression1766);
                            b=expressionPart();

                            state._fsp--;


                            // TEMPLATE REWRITE
                            // 179:19: -> lessEqualThan(left=$a.stright=$b.st)
                            {
                                retval.st = templateLib.getInstanceOf("lessEqualThan",new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                            }



                            }
                            break;
                        case 6 :
                            // Pascal.g:180:16: '<>' b= expressionPart
                            {
                            match(input,21,FOLLOW_21_in_expression1817); 

                            pushFollow(FOLLOW_expressionPart_in_expression1821);
                            b=expressionPart();

                            state._fsp--;


                            // TEMPLATE REWRITE
                            // 181:19: -> notEquals(left=$a.stright=$b.st)
                            {
                                retval.st = templateLib.getInstanceOf("notEquals",new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                            }



                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Pascal.g:183:13: 
                    {
                    // TEMPLATE REWRITE
                    // 183:13: -> {$a.st}
                    {
                        retval.st = (a!=null?a.st:null);
                    }



                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class expressionPart_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "expressionPart"
    // Pascal.g:187:1: expressionPart : (a= podst -> {$a.st}) ( '+' b= podst -> add(left=$expressionPart.stright=$b.st)| '*' b= podst -> mul(left=$expressionPart.stright=$b.st)| '-' b= podst -> sub(left=$expressionPart.stright=$b.st)| '/' b= podst -> div(left=$expressionPart.stright=$b.st)| 'mod' b= podst -> mod(left=$expressionPart.stright=$b.st))* ;
    public final PascalParser.expressionPart_return expressionPart() throws RecognitionException {
        PascalParser.expressionPart_return retval = new PascalParser.expressionPart_return();
        retval.start = input.LT(1);


        PascalParser.podst_return a =null;

        PascalParser.podst_return b =null;


        try {
            // Pascal.g:188:5: ( (a= podst -> {$a.st}) ( '+' b= podst -> add(left=$expressionPart.stright=$b.st)| '*' b= podst -> mul(left=$expressionPart.stright=$b.st)| '-' b= podst -> sub(left=$expressionPart.stright=$b.st)| '/' b= podst -> div(left=$expressionPart.stright=$b.st)| 'mod' b= podst -> mod(left=$expressionPart.stright=$b.st))* )
            // Pascal.g:188:9: (a= podst -> {$a.st}) ( '+' b= podst -> add(left=$expressionPart.stright=$b.st)| '*' b= podst -> mul(left=$expressionPart.stright=$b.st)| '-' b= podst -> sub(left=$expressionPart.stright=$b.st)| '/' b= podst -> div(left=$expressionPart.stright=$b.st)| 'mod' b= podst -> mod(left=$expressionPart.stright=$b.st))*
            {
            // Pascal.g:188:9: (a= podst -> {$a.st})
            // Pascal.g:188:10: a= podst
            {
            pushFollow(FOLLOW_podst_in_expressionPart1918);
            a=podst();

            state._fsp--;


            // TEMPLATE REWRITE
            // 188:18: -> {$a.st}
            {
                retval.st = (a!=null?a.st:null);
            }



            }


            // Pascal.g:189:9: ( '+' b= podst -> add(left=$expressionPart.stright=$b.st)| '*' b= podst -> mul(left=$expressionPart.stright=$b.st)| '-' b= podst -> sub(left=$expressionPart.stright=$b.st)| '/' b= podst -> div(left=$expressionPart.stright=$b.st)| 'mod' b= podst -> mod(left=$expressionPart.stright=$b.st))*
            loop13:
            do {
                int alt13=6;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt13=1;
                    }
                    break;
                case 11:
                    {
                    alt13=2;
                    }
                    break;
                case 13:
                    {
                    alt13=3;
                    }
                    break;
                case 15:
                    {
                    alt13=4;
                    }
                    break;
                case 35:
                    {
                    alt13=5;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // Pascal.g:189:11: '+' b= podst
            	    {
            	    match(input,12,FOLLOW_12_in_expressionPart1935); 

            	    pushFollow(FOLLOW_podst_in_expressionPart1939);
            	    b=podst();

            	    state._fsp--;


            	    // TEMPLATE REWRITE
            	    // 190:13: -> add(left=$expressionPart.stright=$b.st)
            	    {
            	        retval.st = templateLib.getInstanceOf("add",new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	    }



            	    }
            	    break;
            	case 2 :
            	    // Pascal.g:191:11: '*' b= podst
            	    {
            	    match(input,11,FOLLOW_11_in_expressionPart1979); 

            	    pushFollow(FOLLOW_podst_in_expressionPart1983);
            	    b=podst();

            	    state._fsp--;


            	    // TEMPLATE REWRITE
            	    // 192:13: -> mul(left=$expressionPart.stright=$b.st)
            	    {
            	        retval.st = templateLib.getInstanceOf("mul",new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	    }



            	    }
            	    break;
            	case 3 :
            	    // Pascal.g:193:11: '-' b= podst
            	    {
            	    match(input,13,FOLLOW_13_in_expressionPart2022); 

            	    pushFollow(FOLLOW_podst_in_expressionPart2026);
            	    b=podst();

            	    state._fsp--;


            	    // TEMPLATE REWRITE
            	    // 194:13: -> sub(left=$expressionPart.stright=$b.st)
            	    {
            	        retval.st = templateLib.getInstanceOf("sub",new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	    }



            	    }
            	    break;
            	case 4 :
            	    // Pascal.g:195:11: '/' b= podst
            	    {
            	    match(input,15,FOLLOW_15_in_expressionPart2065); 

            	    pushFollow(FOLLOW_podst_in_expressionPart2069);
            	    b=podst();

            	    state._fsp--;


            	    // TEMPLATE REWRITE
            	    // 196:13: -> div(left=$expressionPart.stright=$b.st)
            	    {
            	        retval.st = templateLib.getInstanceOf("div",new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	    }



            	    }
            	    break;
            	case 5 :
            	    // Pascal.g:197:11: 'mod' b= podst
            	    {
            	    match(input,35,FOLLOW_35_in_expressionPart2108); 

            	    pushFollow(FOLLOW_podst_in_expressionPart2112);
            	    b=podst();

            	    state._fsp--;


            	    // TEMPLATE REWRITE
            	    // 198:13: -> mod(left=$expressionPart.stright=$b.st)
            	    {
            	        retval.st = templateLib.getInstanceOf("mod",new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	    }



            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionPart"


    public static class podst_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "podst"
    // Pascal.g:202:1: podst : ( ID -> refVar(id=$ID.text)| INT -> iconst(value=$INT.text)| REAL -> iconst(value=$REAL.text)| '(' expression ')' -> {$expression.st});
    public final PascalParser.podst_return podst() throws RecognitionException {
        PascalParser.podst_return retval = new PascalParser.podst_return();
        retval.start = input.LT(1);


        Token ID22=null;
        Token INT23=null;
        Token REAL24=null;
        PascalParser.expression_return expression25 =null;


        try {
            // Pascal.g:203:5: ( ID -> refVar(id=$ID.text)| INT -> iconst(value=$INT.text)| REAL -> iconst(value=$REAL.text)| '(' expression ')' -> {$expression.st})
            int alt14=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt14=1;
                }
                break;
            case INT:
                {
                alt14=2;
                }
                break;
            case REAL:
                {
                alt14=3;
                }
                break;
            case 9:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // Pascal.g:203:7: ID
                    {
                    ID22=(Token)match(input,ID,FOLLOW_ID_in_podst2167); 

                    // TEMPLATE REWRITE
                    // 204:9: -> refVar(id=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("refVar",new STAttrMap().put("id", (ID22!=null?ID22.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // Pascal.g:205:7: INT
                    {
                    INT23=(Token)match(input,INT,FOLLOW_INT_in_podst2193); 

                    // TEMPLATE REWRITE
                    // 206:9: -> iconst(value=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("iconst",new STAttrMap().put("value", (INT23!=null?INT23.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // Pascal.g:207:7: REAL
                    {
                    REAL24=(Token)match(input,REAL,FOLLOW_REAL_in_podst2219); 

                    // TEMPLATE REWRITE
                    // 208:9: -> iconst(value=$REAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("iconst",new STAttrMap().put("value", (REAL24!=null?REAL24.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // Pascal.g:209:7: '(' expression ')'
                    {
                    match(input,9,FOLLOW_9_in_podst2245); 

                    pushFollow(FOLLOW_expression_in_podst2247);
                    expression25=expression();

                    state._fsp--;


                    match(input,10,FOLLOW_10_in_podst2249); 

                    // TEMPLATE REWRITE
                    // 210:9: -> {$expression.st}
                    {
                        retval.st = (expression25!=null?expression25.st:null);
                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "podst"


    public static class print_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "print"
    // Pascal.g:215:1: print : ( 'writeln' | 'write' ) '(' ( identifierVar )? ')' ';' -> writing_n(txt=$identifierVar.text);
    public final PascalParser.print_return print() throws RecognitionException {
        PascalParser.print_return retval = new PascalParser.print_return();
        retval.start = input.LT(1);


        PascalParser.identifierVar_return identifierVar26 =null;


        try {
            // Pascal.g:216:5: ( ( 'writeln' | 'write' ) '(' ( identifierVar )? ')' ';' -> writing_n(txt=$identifierVar.text))
            // Pascal.g:217:7: ( 'writeln' | 'write' ) '(' ( identifierVar )? ')' ';'
            {
            // Pascal.g:217:7: ( 'writeln' | 'write' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==45) ) {
                alt15=1;
            }
            else if ( (LA15_0==44) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // Pascal.g:217:8: 'writeln'
                    {
                    match(input,45,FOLLOW_45_in_print2289); 

                    }
                    break;
                case 2 :
                    // Pascal.g:217:20: 'write'
                    {
                    match(input,44,FOLLOW_44_in_print2293); 

                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_print2296); 

            // Pascal.g:217:33: ( identifierVar )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Pascal.g:217:33: identifierVar
                    {
                    pushFollow(FOLLOW_identifierVar_in_print2298);
                    identifierVar26=identifierVar();

                    state._fsp--;


                    }
                    break;

            }


            match(input,10,FOLLOW_10_in_print2301); 

            match(input,18,FOLLOW_18_in_print2303); 

            // TEMPLATE REWRITE
            // 218:11: -> writing_n(txt=$identifierVar.text)
            {
                retval.st = templateLib.getInstanceOf("writing_n",new STAttrMap().put("txt", (identifierVar26!=null?input.toString(identifierVar26.start,identifierVar26.stop):null)));
            }



            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "print"


    public static class typ_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "typ"
    // Pascal.g:224:1: typ : ( 'integer' -> type_int(| 'char' -> type_char(| 'longint' -> type_longint(| 'string' -> type_string(| 'real' -> type_real(| 'double' -> type_double();
    public final PascalParser.typ_return typ() throws RecognitionException {
        PascalParser.typ_return retval = new PascalParser.typ_return();
        retval.start = input.LT(1);


        try {
            // Pascal.g:225:5: ( 'integer' -> type_int(| 'char' -> type_char(| 'longint' -> type_longint(| 'string' -> type_string(| 'real' -> type_real(| 'double' -> type_double()
            int alt17=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt17=1;
                }
                break;
            case 26:
                {
                alt17=2;
                }
                break;
            case 34:
                {
                alt17=3;
                }
                break;
            case 39:
                {
                alt17=4;
                }
                break;
            case 37:
                {
                alt17=5;
                }
                break;
            case 29:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // Pascal.g:225:9: 'integer'
                    {
                    match(input,33,FOLLOW_33_in_typ2357); 

                    // TEMPLATE REWRITE
                    // 226:11: -> type_int(
                    {
                        retval.st = templateLib.getInstanceOf("type_int");
                    }



                    }
                    break;
                case 2 :
                    // Pascal.g:227:9: 'char'
                    {
                    match(input,26,FOLLOW_26_in_typ2386); 

                    // TEMPLATE REWRITE
                    // 228:11: -> type_char(
                    {
                        retval.st = templateLib.getInstanceOf("type_char");
                    }



                    }
                    break;
                case 3 :
                    // Pascal.g:229:9: 'longint'
                    {
                    match(input,34,FOLLOW_34_in_typ2418); 

                    // TEMPLATE REWRITE
                    // 230:11: -> type_longint(
                    {
                        retval.st = templateLib.getInstanceOf("type_longint");
                    }



                    }
                    break;
                case 4 :
                    // Pascal.g:231:9: 'string'
                    {
                    match(input,39,FOLLOW_39_in_typ2447); 

                    // TEMPLATE REWRITE
                    // 232:11: -> type_string(
                    {
                        retval.st = templateLib.getInstanceOf("type_string");
                    }



                    }
                    break;
                case 5 :
                    // Pascal.g:233:9: 'real'
                    {
                    match(input,37,FOLLOW_37_in_typ2476); 

                    // TEMPLATE REWRITE
                    // 234:11: -> type_real(
                    {
                        retval.st = templateLib.getInstanceOf("type_real");
                    }



                    }
                    break;
                case 6 :
                    // Pascal.g:235:9: 'double'
                    {
                    match(input,29,FOLLOW_29_in_typ2508); 

                    // TEMPLATE REWRITE
                    // 236:11: -> type_double(
                    {
                        retval.st = templateLib.getInstanceOf("type_double");
                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typ"

    // Delegated rules


 

    public static final BitSet FOLLOW_programBody_in_program98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundStatement_in_programBody138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_compoundStatement225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_compoundStatement227 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_compoundStatement229 = new BitSet(new long[]{0x000004000A000002L});
    public static final BitSet FOLLOW_constantDefinitionPart_in_compoundStatement247 = new BitSet(new long[]{0x0000040002000002L});
    public static final BitSet FOLLOW_variableDeclarationPart_in_compoundStatement260 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_statements_in_compoundStatement276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_constantDefinitionPart342 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_constantDefinition_in_constantDefinitionPart352 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_identifierVar_in_constantDefinition372 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_constantDefinition374 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_constantDefinition376 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_constantDefinition378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_variableDeclarationPart419 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationPart429 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_identifierVar_in_variableDeclaration452 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_variableDeclaration454 = new BitSet(new long[]{0x000000A624000000L});
    public static final BitSet FOLLOW_typ_in_variableDeclaration456 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_variableDeclaration457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifierVar500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_statements533 = new BitSet(new long[]{0x00003841C20402E0L});
    public static final BitSet FOLLOW_variableDeclaration_in_statements543 = new BitSet(new long[]{0x00003841C20402E0L});
    public static final BitSet FOLLOW_statement_in_statements557 = new BitSet(new long[]{0x00003841C20402E0L});
    public static final BitSet FOLLOW_31_in_statements570 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_statements572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repetetiveStatement_in_statement631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalStatement_in_statement664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement693 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_statement695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statements_in_statement736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentStatement_in_statement785 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_statement787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_statement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_statement859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_statement911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_repetetiveStatement964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeatStatement_in_repetetiveStatement991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_whileStatement1088 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_expression_in_whileStatement1092 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_whileStatement1094 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_statements_in_whileStatement1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_repeatStatement1217 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_statements_in_repeatStatement1219 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_repeatStatement1221 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_expression_in_repeatStatement1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_conditionalStatement1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ifStatement1386 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_expression_in_ifStatement1391 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifStatement1393 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_statements_in_ifStatement1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentStatement1471 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_assignmentStatement1473 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_expression_in_assignmentStatement1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionPart_in_expression1523 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_22_in_expression1540 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_expressionPart_in_expression1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_expression1594 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_expressionPart_in_expression1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_expression1652 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_expressionPart_in_expression1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_expression1707 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_expressionPart_in_expression1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_expression1762 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_expressionPart_in_expression1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_expression1817 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_expressionPart_in_expression1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_podst_in_expressionPart1918 = new BitSet(new long[]{0x000000080000B802L});
    public static final BitSet FOLLOW_12_in_expressionPart1935 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_podst_in_expressionPart1939 = new BitSet(new long[]{0x000000080000B802L});
    public static final BitSet FOLLOW_11_in_expressionPart1979 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_podst_in_expressionPart1983 = new BitSet(new long[]{0x000000080000B802L});
    public static final BitSet FOLLOW_13_in_expressionPart2022 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_podst_in_expressionPart2026 = new BitSet(new long[]{0x000000080000B802L});
    public static final BitSet FOLLOW_15_in_expressionPart2065 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_podst_in_expressionPart2069 = new BitSet(new long[]{0x000000080000B802L});
    public static final BitSet FOLLOW_35_in_expressionPart2108 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_podst_in_expressionPart2112 = new BitSet(new long[]{0x000000080000B802L});
    public static final BitSet FOLLOW_ID_in_podst2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_podst2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_podst2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_podst2245 = new BitSet(new long[]{0x00000000000002E0L});
    public static final BitSet FOLLOW_expression_in_podst2247 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_podst2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_print2289 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_44_in_print2293 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_print2296 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_identifierVar_in_print2298 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_print2301 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_print2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_typ2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_typ2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_typ2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_typ2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_typ2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_typ2508 = new BitSet(new long[]{0x0000000000000002L});

}