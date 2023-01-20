package edu.pitt.lab7;

import javax.swing.JOptionPane;
import java.util.Random;

public class Lab7 {

	public static double max(double[] data) {
		double max = 0;
		for (int a = 0; a < data.length; a++) {
			if(data[a] > max) {
				max = data[a];
			}
		}
		return max;
		
	}
	public static double min(double[] data) {
		double min = 0;
		for (int a = 0; a < data.length; a++) {
			if(data[a] < min) {
				min = data[a];
			}
		}
		return min;
		
	}
	public static double sum(double[] data) {
		double sum = 0;
		for (int a = 0; a < data.length; a++) {
				sum += data[a];
			}
			return sum;
		}
		
			
	public static double ave(double[] data) {
		double sum = 0;
		for (int a = 0; a < data.length; a++) {
				sum += data[a];
			}
			return (sum/data.length);
	}
	public static void main(String[] args) {
		String question = JOptionPane.showInputDialog("Please enter the amount of numbers in your array: ");
		int numCt = Integer.parseInt(question);
		double[] myArray = new double[numCt];
		Random rand = new Random();
		for (int i = 0; i < numCt; i++) {
			myArray[i] = rand.nextInt();
	}
		
	System.out.println("The maximum value in the array = " + max(myArray));
	System.out.println("The minimum value in the array = " + min(myArray));
	System.out.println("The sum of the values in the array = " + sum(myArray));
	System.out.println("The average of the values in the array = " + ave(myArray));
	
	}
	
}
