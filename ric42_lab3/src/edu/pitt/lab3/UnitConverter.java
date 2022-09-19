package edu.pitt.lab3;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		
		/*conversion combinations:
		in, cm, yd, m, oz, gm, kg, lb
		in - cm
		cm - in
		yd - m
		m - yd
		oz - gm
		gm - oz
		kg - lb
		lb - kg
		*/
    
		//storing input number as a String
		String userInputNumber = JOptionPane.showInputDialog("Please enter a distance or weight amount (with units): ");
		
		//defining the index of the space between user inputs
		int space_index;
		space_index = userInputNumber.indexOf(' ');
		
		//finding numeric value from user input
		String value;
		value = userInputNumber.substring(0, space_index);
		
		//getting unit from user input by telling java that unit is character after the space until length that user inputted
		String unit;
		unit = userInputNumber.substring(space_index + 1, userInputNumber.length());
		
		//turning numeric value from user input into double
		double num_value = Double.parseDouble(value);
		
		//checking which unit the user inputed and calculating output
		if (unit.equals("in")) {
			double inToCm = num_value*2.54;
			JOptionPane.showMessageDialog(null, "=" + inToCm + " cm");
		}
		else if (unit.equals("cm")) {
			double cmToIn = num_value/2.54;
            JOptionPane.showMessageDialog(null, "=" + cmToIn + " in");
        }
        else if (unit.equals("yd")) {
            double ydToM = num_value*0.914;
            JOptionPane.showMessageDialog(null, "=" + ydToM + " m");
        }
        else if (unit.equals("m")) {
            double mToYd = num_value/0.914;
            JOptionPane.showMessageDialog(null, "=" + mToYd + " yd");
        }
        else if (unit.equals("oz")) {
            double ozToGm = num_value*28.349;
            JOptionPane.showMessageDialog(null, "=" + ozToGm + " gm");
        }
        else if (unit.equals("gm")) {
            double gmToOz = num_value/28.349;
            JOptionPane.showMessageDialog(null, "=" + gmToOz + " oz");
        }
        else if (unit.equals("kg")) {
            double kgToLb = num_value*2.204;
            JOptionPane.showMessageDialog(null, "=" + kgToLb + " lb");
        }
        else if (unit.equals("lb")) {
            double lbToKg = num_value/2.204;
            JOptionPane.showMessageDialog(null, "=" + lbToKg + " kg");
        } else {
            JOptionPane.showMessageDialog(null, "Cannot compute, oops.");
        }
    }
}
		
		
		