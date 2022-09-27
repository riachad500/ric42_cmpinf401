package edu.pitt.lab4;

import javax.swing.JOptionPane;

public class Logarithm {

	public static void main(String[] args) {
		
	// stores Value1 as a String
	String userValue1 = JOptionPane.showInputDialog("Enter your log: ");

	// stores Value2 as a String
	String userValue2= JOptionPane.showInputDialog("Enter your base: ");

	// converts user inputs into integers
	int userValueNum1 = Integer.parseInt(userValue1);
	int userValueNum2 = Integer.parseInt(userValue2);
	
	// converting to double
	double ValueNum1 = userValueNum1;
	double ValueNum2 = userValueNum1;
	
	//continues asking for input until correct
		while (ValueNum1 < 0)
			userValue1 = JOptionPane.showInputDialog("Enter your log (must be above zero): ");
	
	//continues asking for input until correct
		while (ValueNum2 < 1)
			userValue1 = JOptionPane.showInputDialog("Enter your log (must be above one): ");
	
	// defining how to calculate logs; as long as X is less than b, the loop causes a division
		double LogCalc;
		int count = 0;
		while  (ValueNum1 > ValueNum2){
	         LogCalc = ValueNum1/ValueNum2;
	         System.out.println(LogCalc);
	         count++; 
	      }
	
	      System.out.println(count);

	      return;
	

	}
		
	}

		