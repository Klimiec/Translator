package com.piotrek.model.clas;

/*
 *   Opis: Generuje klase na podstawie Interfejsu : implementacja wszystkich metod
 */

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.antlr.v4.runtime.TokenStream;

public class ConvertFromInterfaceToClass extends JavaBaseListener {

    // Attributes 
	private PropertyChangeSupport propertyChangeSupport;
	private TokenStream tokens;
	private String temp;
	private String voidIdent;
	private int newLine = 1;


    // Constructor 
    public ConvertFromInterfaceToClass(JavaParser parser, PropertyChangeListener propertyChangeListener) {
    	
    	this.propertyChangeSupport = new PropertyChangeSupport(this);
    	this.propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
        
        tokens = parser.getTokenStream();
        temp ="";
        voidIdent = "   public void ";
    }


    //*********************************************************************
    //**************** Normal Interface Declaration *********************** 
    //*********************************************************************
    @Override 
    public void enterNormalInterfaceDeclaration(JavaParser.NormalInterfaceDeclarationContext ctx) { 
    	
        String interfaceIdentifier = ctx.Identifier().getText();
        String classIdentifier = "Cxx" + interfaceIdentifier; 
        
        String result = "public class "+ classIdentifier +" implements " + interfaceIdentifier + " {\n";
        propertyChangeSupport.firePropertyChange("ToClassParser", null, result);
    }


    @Override 
    public void exitNormalInterfaceDeclaration(JavaParser.NormalInterfaceDeclarationContext ctx) { 
    	
    	String result = "}\n";
    	propertyChangeSupport.firePropertyChange("ToClassParser", null, result);
    }


    //*********************************************************************
    //****************** Interface Method or Field Decl *******************
    //*********************************************************************


    /*  get method modifiers */
    @Override 
    public void enterInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) { 
        temp = "   " + tokens.getText(ctx.modifiers());
    }

    /*  get identifier */
    @Override 
    public void enterInterfaceMethodOrFieldDecl(JavaParser.InterfaceMethodOrFieldDeclContext ctx) { 
        temp = temp + tokens.getText(ctx.type()) + " " + ctx.Identifier().getText() + " ";
    }

    @Override 
    public void enterInterfaceMethodDeclaratorRest(JavaParser.InterfaceMethodDeclaratorRestContext ctx) { 
    	if (newLine == 1){
    		newLine++;
    		propertyChangeSupport.firePropertyChange("ToClassParser", null, "\n");
    	}
        temp = temp + tokens.getText(ctx.formalParameters()) + " {}; \n";
    	propertyChangeSupport.firePropertyChange("ToClassParser", null, temp);
        temp = "";
    }

    @Override 
    public void enterConstantDeclaratorRest(JavaParser.ConstantDeclaratorRestContext ctx) { 
        temp = temp + "= " + tokens.getText(ctx.variableInitializer()) +";\n";
        propertyChangeSupport.firePropertyChange("ToClassParser", null, temp);
        temp="";
    }
    
    @Override 
    public void enterInterfaceMemberDecl(JavaParser.InterfaceMemberDeclContext ctx) { 
        try{
            voidIdent = voidIdent + ctx.Identifier().getText() + " ";
        }catch(Exception ex){/*handle exception*/}
        
    }

    @Override 
    public void enterVoidInterfaceMethodDeclaratorRest(JavaParser.VoidInterfaceMethodDeclaratorRestContext ctx) { 
    	if (newLine == 1){
    		newLine++;
    		propertyChangeSupport.firePropertyChange("ToClassParser", null, "\n");
    	}
        voidIdent =voidIdent + tokens.getText(ctx.formalParameters()) + " {};\n";
        propertyChangeSupport.firePropertyChange("ToClassParser", null, voidIdent);
        voidIdent ="   public void ";
    }
}




