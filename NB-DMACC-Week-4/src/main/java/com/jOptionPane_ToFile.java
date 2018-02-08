package com;

import javax.swing.*;  
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter; 

//Nick Bergan     DMACC Week-4 (Maven)     This program uses JFrames to get the user's name, and saves it to an output text file,
//the output file location is under the root project folder. This project uses Maven for version control

public class jOptionPane_ToFile {
	 
    public static void main(String[] args) throws FileNotFoundException {  
    	
    	final PrintWriter printWriter = new PrintWriter("output.txt");
    	
        JFrame frame = new JFrame("Demo-JFrame");  
        JPanel panel = new JPanel();  
        JLabel label = new JLabel("Input your name, then click submit");
        final JTextField textBox = new JTextField();
        
        JButton button = new JButton();  
        button.setText("Submit");
        

	    textBox.setBounds(50,50, 250,22); //x1, y1, y1, y2
	    //textBox.set
	    textBox.setToolTipText("Input Name Here");	    

	    
	    panel.add(label);
        panel.add(button);
	    
	    frame.add(textBox);
	    frame.add(panel);
	    
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
	    button.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		printWriter.println(textBox.getText());
	            textBox.setText("Thank You, Please close the window.");
	        }
	    });
	    
	    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            //@Override
            public void windowClosing(java.awt.event.WindowEvent event) {
                event.getWindow().dispose();                
                printWriter.close();
                System.out.println("File saved, jOptionPane_ToFile.java - finished successfully");
            }
        });
        
        
    }
}  