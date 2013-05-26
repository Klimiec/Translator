package com.piotrek.controller;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;

import org.antlr.runtime.RecognitionException;

import com.piotrek.gui.AppWindow;
import com.piotrek.model.clas.ConvertToClassModel;
import com.piotrek.model.inter.ExtractInterfaceModel;
import com.piotrek.model.trans.TranslateToPascalModel;

public class Controller implements PropertyChangeListener {

	// Attributes 
	private AppWindow appWindow;                  // Attributes : view
	private File file;
	private ExtractInterfaceModel extractInterfaceModel;
	private ConvertToClassModel convertToClassModel;
	private TranslateToPascalModel translateToPascalModel;
	
	
	// Constructor 
	public Controller() {
		extractInterfaceModel = new ExtractInterfaceModel(Controller.this);
	    convertToClassModel = new ConvertToClassModel(Controller.this);
	    translateToPascalModel = new TranslateToPascalModel(Controller.this);
	}
	
	// Set view 
	public void setView(AppWindow appWindow){
		this.appWindow = appWindow;
	}
	
	public AppWindow getAppWindow() {
		return appWindow;
	}

	public void setAppWindow(AppWindow appWindow) {
		this.appWindow = appWindow;
	}
	
	
	/*************************************************************
	/*****  Controllers methods invoked in View (AppWindow)  *****
	 ************************************************************/
	
	/*
	 *  Opis: wyswietlenie pomocniczego okna w ktorym 
	 *  bedzie mozliwosc wskazania pliku do parsowania
	 */
	public void chooseFileShowWindow() {
		getAppWindow().selectFile();
	}
	
	/*
	 *  Opis:Ustawienie zmienej wskazujacej plik ktory bedziemy parsowac
	 */
	public void fileToParse(File file){
		this.file = file;
		//getAppWindow().unlockStartButton();
	}
	
	/*
	 *  Opis: rozpoczecie konwersji w zaleznosci od wybranej opcji 
	 *  zostanie wykonana :
	 *  a) transformacja interfejsu na klase
	 *  b) konwersja klasy na interfejs 
	 *  c) translacja do Pascala
	 *  
	 *  Jednak pierw trzeba wyzerowac pole ""
	 */
	public void convertTo(String option) throws IOException, RecognitionException{
		
		getAppWindow().clearOutputArea();
		
		if (option.equals("interface")){
			extractInterfaceModel.setFile(file);
			extractInterfaceModel.start();
		}else if (option.equals("class")){
			convertToClassModel.setFile(file);
			convertToClassModel.start();
		}else if (option.equals("translate")){
			translateToPascalModel.setFile(file);
			translateToPascalModel.start();
		}
	}
	

	/*************************************************************
	/**************** KVO : key value observing  *****************
	 ************************************************************/
	/* Obsluga wiadomosci przychodzacych z modeli */
	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		
		String propertyName = arg0.getPropertyName();   // notification info
		String msg = (String) arg0.getNewValue();       // received message
		
		if (propertyName.equals("ToInterfaceParser")){
			getAppWindow().appendTextToResult(msg);
		}else if (propertyName.equals("ToClassParser")){
			getAppWindow().appendTextToResult(msg);
		}else if (propertyName.equals("Translate")){
			getAppWindow().appendTextToResult(msg);
		}
	}
}
