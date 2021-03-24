//****************************************************************************************
//Author: Jacob Vaught       Modified: 11/24/20
//
//EGR-281  Project 13  			  Due: 11/25/20 6:00PM
//****************************************************************************************
//finished coding 11-24-2020  9:00PM
//A Secret Language (encryption Program)
//I know you did not tell us to use menus, but I thought it would save me from making multiple Panels.
//Hope You Like It.
//P.S. The CipherDriver runs in the console. if you want, i can make cipherGUI be started by CipherDriver, instead of running a console program


package project13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField; 

public class CipherGUI implements ActionListener {  
          
	//I researched this stuff!
	//Also, I hope the variable names are not too long. i Started out with 2 character names, but changed them before sending to you
	JMenu substitutionMenu, transpositionMenu;  
          JMenuItem encodeTranspositionSubMenu, decodeTranspositionSubMenu, encodeSubstitutionSubMenu, decodeSubstitutionSubMenu;  
          JTextField answerTextField, inputTextField;
          JLabel textPromptLabel,answerPromptLabel,decodingLabel,encodingLabel,transpositionLabel,substitutionLabel;
          JButton encodeButton, decodeButton;
          
private  CipherGUI(){  
          JFrame frame= new JFrame("Encryption & Decryption GUI (A SECRET LANGUAGE)");  
          JMenuBar menuBar=new JMenuBar();    
          encodeButton=new JButton("ENCODE");  
          encodeButton.setBounds(275,100,81,30); //81 happens to be smallest number that will fit Decode and encode inside a button 
          decodeButton=new JButton("DECODE");  
          decodeButton.setBounds(275,100,81,30); 
          frame.add(encodeButton); frame.add(decodeButton);
          encodeButton.setVisible(false);
          decodeButton.setVisible(false);
          encodeButton.addActionListener(this);
          decodeButton.addActionListener(this);
          
          
          inputTextField=new JTextField("abcdefghij");  
          inputTextField.setBounds(50,100, 200,30);  
          answerTextField=new JTextField("afbgchdiej");  
          answerTextField.setBounds(50,175, 200,30);  
          frame.add(inputTextField); frame.add(answerTextField);
          answerTextField.setEditable(false);
          answerTextField.setVisible(false);
          inputTextField.setVisible(false);
          inputTextField.setEditable(true);          
          
         
          
          textPromptLabel=new JLabel("Enter Your text Here.");  
          textPromptLabel.setBounds(50,75, 200,30);  
          answerPromptLabel=new JLabel("The Answer is Here.");  
          answerPromptLabel.setBounds(50,150, 200,30);  
          decodingLabel=new JLabel("Decoding...");  
          decodingLabel.setBounds(50,125, 200,30);  
          encodingLabel=new JLabel("Encoding...");  
          encodingLabel.setBounds(50,125, 200,30); 
          transpositionLabel=new JLabel("Transposition");  
          transpositionLabel.setBounds(150,25, 200,30);  
          substitutionLabel=new JLabel("Substitution");  
          substitutionLabel.setBounds(150,25, 200,30);  
          frame.add(textPromptLabel); frame.add(answerPromptLabel); frame.add(decodingLabel); frame.add(encodingLabel); frame.add(transpositionLabel); frame.add(substitutionLabel);
          textPromptLabel.setVisible(false);
          answerPromptLabel.setVisible(false);
          decodingLabel.setVisible(false);
          encodingLabel.setVisible(false);
          transpositionLabel.setVisible(false);
          substitutionLabel.setVisible(false);
          

          transpositionMenu=new JMenu("Transposition"); 
          substitutionMenu=new JMenu("Substitution"); 
          encodeTranspositionSubMenu=new JMenuItem("Encode");  
          decodeTranspositionSubMenu=new JMenuItem("Decode");  
          encodeSubstitutionSubMenu=new JMenuItem("Encode");  
          decodeSubstitutionSubMenu=new JMenuItem("Decode");
          encodeTranspositionSubMenu.addActionListener(this);
          decodeTranspositionSubMenu.addActionListener(this);
          encodeSubstitutionSubMenu.addActionListener(this);
          decodeSubstitutionSubMenu.addActionListener(this);
          
          
          transpositionMenu.add(encodeTranspositionSubMenu); transpositionMenu.add(decodeTranspositionSubMenu); 
          substitutionMenu.add(encodeSubstitutionSubMenu); substitutionMenu.add(decodeSubstitutionSubMenu);  
          substitutionMenu.add(substitutionMenu);
          substitutionMenu.add(transpositionMenu);
          menuBar.add(substitutionMenu); 
          menuBar.add(transpositionMenu);
          frame.setJMenuBar(menuBar);  
          frame.setSize(400,400);  
          frame.setLayout(null);  
          frame.setVisible(true);  
}  //ending bracket of  method CipherGUI
public static void main(String args[])  
{  
new CipherGUI();  
}//ending bracket of main method
public void actionPerformed(ActionEvent actionEvent) {
	  
    
    //checks if menu button has been pressed
	if(actionEvent.getSource()==encodeTranspositionSubMenu) {
		transpositionLabel.setVisible(true);
		textPromptLabel.setVisible(true);
		substitutionLabel.setVisible(false);
		decodingLabel.setVisible(false);
		encodingLabel.setVisible(false);
		answerPromptLabel.setVisible(false);
		inputTextField.setVisible(true);
		encodeButton.setVisible(true);
		answerTextField.setVisible(false);
		decodeButton.setVisible(false);
	
	}if(actionEvent.getSource()==decodeTranspositionSubMenu) {
		transpositionLabel.setVisible(true);
		textPromptLabel.setVisible(true);
		substitutionLabel.setVisible(false);
		decodingLabel.setVisible(false);
		encodingLabel.setVisible(false);
		answerPromptLabel.setVisible(false);
		inputTextField.setVisible(true);
		decodeButton.setVisible(true);
		answerTextField.setVisible(false);
		encodeButton.setVisible(false);
	
	}if(actionEvent.getSource()==encodeSubstitutionSubMenu) {
		substitutionLabel.setVisible(true);
		textPromptLabel.setVisible(true);
		transpositionLabel.setVisible(false);
		decodingLabel.setVisible(false);
		encodingLabel.setVisible(false);
		answerPromptLabel.setVisible(false);
		inputTextField.setVisible(true);
		encodeButton.setVisible(true);
		answerTextField.setVisible(false);
		decodeButton.setVisible(false);
	
	}if(actionEvent.getSource()==decodeSubstitutionSubMenu) {
		substitutionLabel.setVisible(true);
		textPromptLabel.setVisible(true);
		transpositionLabel.setVisible(false);
		decodingLabel.setVisible(false);
		encodingLabel.setVisible(false);
		answerPromptLabel.setVisible(false);
		inputTextField.setVisible(true);
		decodeButton.setVisible(true);
		answerTextField.setVisible(false);
		encodeButton.setVisible(false);
	
	//checks if encode/decode button has been pressed
	}
	
	String input = inputTextField.getText();
	SubstitutionCipher sC = new SubstitutionCipher(3);//used numbers given in word doc.
	TranspositionCipher tC = new TranspositionCipher(1);//used numbers given in word doc.
	if(actionEvent.getSource()==decodeButton && substitutionLabel.isVisible()==true) {
		decodingLabel.setVisible(true);
		answerTextField.setVisible(true);
		answerPromptLabel.setVisible(true);
		answerTextField.setText(sC.decode(input));
	
	}if(actionEvent.getSource()==encodeButton && substitutionLabel.isVisible()==true) {		
		encodingLabel.setVisible(true);
		answerPromptLabel.setVisible(true);
		answerTextField.setText(sC.encode(input));
		answerTextField.setVisible(true);
	
	}if(actionEvent.getSource()==decodeButton && transpositionLabel.isVisible()==true) {				
		decodingLabel.setVisible(true);
		answerPromptLabel.setVisible(true);
		answerTextField.setText(tC.decode(input));
		answerTextField.setVisible(true);	
	
	}if(actionEvent.getSource()==encodeButton && transpositionLabel.isVisible()==true) {				
		encodingLabel.setVisible(true);
		answerPromptLabel.setVisible(true);
		answerTextField.setText(tC.encode(input));
		answerTextField.setVisible(true);
	}//closing bracket of 2nd level if//closing bracket of 1st level if
		   
}//ending bracket of method actionPerformed     
	
}// ending bracket of class CipherGUI
  