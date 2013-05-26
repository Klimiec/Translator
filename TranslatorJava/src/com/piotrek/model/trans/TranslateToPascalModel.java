package com.piotrek.model.trans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

public class TranslateToPascalModel {
	
	// Attributes 
	private File file;
	private PropertyChangeSupport propertyChangeSupport;
	
	// Constructor 
	public TranslateToPascalModel(PropertyChangeListener propertyChangeListenerr) {
		this.propertyChangeSupport = new PropertyChangeSupport(this);
    	this.propertyChangeSupport.addPropertyChangeListener(propertyChangeListenerr);
	}
	
	// Setters 
	public void setFile(File file) {
		this.file = file;
	}
	
	public void start() throws FileNotFoundException, IOException, RecognitionException{
		
		StringTemplateGroup templates = null;
		String napis3 = getClass().getResource("Java.stg").toString();
		napis3 = napis3.replace("file:", "");
		templates = new StringTemplateGroup(new FileReader(napis3),AngleBracketTemplateLexer.class);
		
		CharStream input = new ANTLRFileStream(file.toString());
		PascalLexer lexer = new PascalLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PascalParser parser = new PascalParser(tokens);
		
		parser.setTemplateLib(templates);
		RuleReturnScope r = parser.program();
		String result = r.getTemplate().toString();
		
		propertyChangeSupport.firePropertyChange("Translate", null, result);
	}
}
