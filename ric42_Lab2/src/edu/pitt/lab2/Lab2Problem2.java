package edu.pitt.lab2;


import javax.swing.JOptionPane;

public class Lab2Problem2 {
	
	public static void main(String[] args) {
		
    
	// stores input R as a String
		String userInputR = JOptionPane.showInputDialog("Please enter the radius of your circle: ");

    // converts R into integer
    int userInputNumR = Integer.parseInt(userInputR);

    // convert to double and R*pi
    double rpi = Math.pow(userInputNumR, Math.PI);
    

    // perimeter
    double perimeter = Math.pow(rpi, 2);

    // r^2
    double rSquared = Math.pow(userInputNumR, 2);
    
    // area
    double area = Math.pow(rpi, rSquared);
    
    JOptionPane.showMessageDialog(null, perimeter);
    JOptionPane.showMessageDialog(null, area);

	}

}
