package com.piotrek.model.inter;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.antlr.v4.runtime.TokenStream;

public class ConvertToInterface extends JavaBaseListener {

    // Attributes 
    private JavaParser parser;
    private PropertyChangeSupport propertyChangeSupport;


    // Constructor 
    public ConvertToInterface(JavaParser parser, PropertyChangeListener propertyChangeListener) {
        this.parser = parser;
        propertyChangeSupport = new PropertyChangeSupport(this);
        this.propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
    }


    //*********************************************************************
    //********************** Class Declaration ****************************
    //*********************************************************************
    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx){
    	
        String identifier = ctx.Identifier().getText();
        String result = "interface I"+ identifier +" {\n";
        propertyChangeSupport.firePropertyChange("ToInterfaceParser", null, result);
    }
    @Override
    public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
    	
    	String result = "}\n";
    	propertyChangeSupport.firePropertyChange("ToInterfaceParser", null, result);
    }

    //*********************************************************************
    //************************ Method Declaration *************************
    //*********************************************************************
    @Override
    public void enterMethodDeclaration(
        JavaParser.MethodDeclarationContext ctx
    )
    {
        // need parser to get tokens
        TokenStream tokens = parser.getTokenStream();
        String type = "void";

        if ( ctx.type()!=null ) {
            type = tokens.getText(ctx.type());
        }

        String methodArgs = tokens.getText(ctx.formalParameters());
        String identifier = ctx.Identifier().getText();
       
        // Do not output main function
        if (!identifier.equals("main")){
        	String result = "   " + type + " " + identifier + methodArgs + ";\n";
        	propertyChangeSupport.firePropertyChange("ToInterfaceParser", null, result);
        }
    }
}


















