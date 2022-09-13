package edu.pitt.lab2;


import javax.swing.JOptionPane;

public class Lab2Problem1 {
	
	public static void main(String[] args) {
		
    
		// stores input A as a String
		String userInputA = JOptionPane.showInputDialog("Please enter side A of your triange: ");

    // stores input B as a String
		String userInputB= JOptionPane.showInputDialog("Please enter side B of your triange: ");

    // converts A & B into integers
    int userInputNumA = Integer.parseInt(userInputA);
    int userInputNumB = Integer.parseInt(userInputB);

    // A^2
    double aSquared = Math.pow(userInputNumA, 2);
    // B^2
    double bSquared = Math.pow(userInputNumB, 2);

    // Pythag Theorem
    double cSquared = aSquared + bSquared;

    // square roots cSquared
    double hypotenuse = Math.sqrt(cSquared);
    
    JOptionPane.showMessageDialog(null, hypotenuse);

	}

}
