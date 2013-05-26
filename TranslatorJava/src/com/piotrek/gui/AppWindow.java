package com.piotrek.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.piotrek.controller.Controller;

@SuppressWarnings("serial")
public class AppWindow extends JFrame {

	
	// Attributes - GUI 
	private JPanel contentPane;
	private JTextArea resultTextArea;
    private JComboBox operationComboBox;
    
    private JButton chooseButton;
    private JButton saveButton;
    private JButton startButton;
    
    private JLabel lblNewLabel_1;
    private JScrollPane scrollPane;
    private JPanel panel;
    private JLabel lblNewLabel;
    

	// Attributes 
    private Controller controller;
	private File inputFile;
	private JFileChooser jFileChooser;
	private String[] options;
	
	
	
	// Getters & Setters 
	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}
	

	// Constructor
	public AppWindow(Controller controller) {
		
		// Set GUI
		initGui();           // initiate variables
		setGui();            // arrange components 
		setGuiListeners();   // set listeners 
		
		// Set controller 
		setController(controller);
		getController().setView(this);
	}
	
	
	/*
	 *  Description: initialize GUI variables  
	 */
	public void initGui(){
		
		jFileChooser = new JFileChooser();
		options = new String[]{"interface", "class", "translate"};	
		
		chooseButton = new JButton("Choose file");
		saveButton = new JButton("Save");
		startButton = new JButton("Start");
		
		operationComboBox = new JComboBox(options);
		lblNewLabel = new JLabel("File : ");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
	    lblNewLabel_1 = new JLabel("Convert into : ");
		panel = new JPanel();
		scrollPane = new JScrollPane();
		resultTextArea = new JTextArea();
		
	}
	
	/*
	 *  Description: arrange GUI elements on the panel 
	 */
	
	public void setGui(){
		
		// General GUI settings 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    /*  Buttons section    */
		chooseButton.setIcon(new ImageIcon(AppWindow.class.getResource("/Icons/Document-Blank-icon.png")));
		chooseButton.setBounds(79, 33, 117, 29);
		contentPane.add(chooseButton);
		
		saveButton.setIcon(new ImageIcon(AppWindow.class.getResource("/Icons/save-icon-2.png")));
		saveButton.setBounds(354, 461, 88, 29);
		contentPane.add(saveButton);
		
		startButton.setBounds(46, 461, 88, 29);
		contentPane.add(startButton);
		
		
		// JComboBox : select type of parse 
		operationComboBox.setBounds(325, 33, 117, 29);
		contentPane.add(operationComboBox);
		

		/*  Others  */
		lblNewLabel.setBounds(33, 33, 44, 24);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1.setBounds(231, 34, 96, 24);
		contentPane.add(lblNewLabel_1);

		panel.setBorder(new TitledBorder(null, "Result", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(25, 89, 423, 360);
		contentPane.add(panel);
		panel.setLayout(null);
		
		scrollPane.setBounds(16, 17, 390, 324);
		panel.add(scrollPane);
		scrollPane.setViewportView(resultTextArea);		
	}
	
	
	public void setGuiListeners(){
		
		/*  Wybor pliku do parsowania   */
		chooseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getController().chooseFileShowWindow();
			}
		});


		/* rozpoczecie wlasciwwego procesu konwersji */
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int index = operationComboBox.getSelectedIndex();
				try {
					getController().convertTo(options[index]);
				} catch (Exception e1) {/* handle exception */}
			}
		});
		
		
		/*
		 *  Opis: zapis wyniku do pliku (na razie zostaw puste) 
		 */
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO
			}
		});
	}
	
	
	/********************************************************
	/*********  Metody wywolywane przez Controller***********
	*********************************************************/
	
	/* 
	 * Opis:  Wybor pliku do parsowania  : wyswietlenie okna wyszukania pliku
	 */
	public void selectFile(){
		jFileChooser.showOpenDialog(AppWindow.this);
		inputFile = jFileChooser.getSelectedFile();
		getController().fileToParse(inputFile);
	}
	
	/*
	 * Opis: wyzerowanie pola w ktorym bedzie wyswietlany wynik parsowania 
	 */
	public void clearOutputArea(){
		resultTextArea.setText("");
	}
	
	/*
	 * Opis: dodanie nowej wiadmosci do pola wyswietlajacego wynik parsowania
	 */
	public void appendTextToResult(String text){
		resultTextArea.append(text);
	}
	
	/*
	 * Opis: odblokowanie przycisku rozpoczecia parsowania. 
	 * Uchwyt do pliku zostal przekazany do controllera
	 */
	public void unlockStartButton() {
		/* TODO:  */
	}
}







