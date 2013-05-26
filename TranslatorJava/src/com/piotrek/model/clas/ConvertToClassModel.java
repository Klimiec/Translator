package com.piotrek.model.clas;

import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class ConvertToClassModel {
	
	// Attributes 
	File file;
	PropertyChangeListener propertyChangeListenerr;
	
	// Constructor
	public ConvertToClassModel(PropertyChangeListener propertyChangeListenerr) {
		this.propertyChangeListenerr = propertyChangeListenerr;
	}
	
	// Setters 
	public void setFile(File file) {
		this.file = file;
	}
	
	public void start() throws FileNotFoundException, IOException{
		
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));
        JavaLexer javaLexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(javaLexer);
        JavaParser javaParser = new JavaParser(tokens);
        ParseTree tree = javaParser.compilationUnit(); // parse
        
        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        ConvertFromInterfaceToClass convertToInterface = new ConvertFromInterfaceToClass(javaParser, propertyChangeListenerr);
        walker.walk(convertToInterface, tree); // initiate walk of tree with listener
	}
}
