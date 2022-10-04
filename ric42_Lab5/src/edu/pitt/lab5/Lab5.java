package edu.pitt.lab5;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

  public class Lab5 {

	static void RollDice(int rollNumber, Random diceNumber) {
	
		 int firstDice = diceNumber.nextInt(6)+1;
		 int secondDice = diceNumber.nextInt(6)+1;
		 
		 int dieTotal = firstDice + secondDice;
		 
		//all the dice starts at zero
		int getTwo = 0;
		int getThree = 0;
		int getFour = 0;
		int getFive = 0;
		int getSix = 0;
		int getSeven = 0;
		int getEight = 0;
		int getNine = 0;
		int getTen = 0;
		int getEleven = 0;
		int getTwelve = 0;
		
		//so if you roll a two from both dice, then you tally that by making the count go up
		if (dieTotal == 2);
			getTwo++;
		
		if (dieTotal == 3);
			getThree++;
			
		if (dieTotal == 4);
			getFour++;
			
		if (dieTotal == 5);
			getFive++;
		
		if (dieTotal == 6);
			getSix++;
		
		if (dieTotal == 7);
			getSeven++;
			
		if (dieTotal == 8);
			getEight++;
			
		if (dieTotal == 9);
			getNine++;
		
		if (dieTotal == 10);
			getTen++;
		
		if (dieTotal == 11);
			getEleven++;
			
		if (dieTotal == 12);
			getTwelve++;
			

		System.out.println("The probability of rolling the numbers on the dice are: \n" + "2: " + (double)getTwo/rollNumber * 100 + "% \n" + "3: " + (double)getThree/rollNumber * 100 + "% \n" + "4: " + (double)getFour/rollNumber * 100 + "% \n" + "5: " + (double)getFive/rollNumber * 100 + "% \n" + "6: " + (double)getSix/rollNumber * 100 + "% \n" + "7: " + (double)getSeven/rollNumber * 100 + "% \n" + "8: " + (double)getEight/rollNumber * 100 + "% \n" + "9: " + (double)getNine/rollNumber * 100 + "% \n" + "10: " + (double)getTen/rollNumber * 100 + "% \n" + "11: " + (double)getEleven/rollNumber * 100 + "% \n" + "12: " + (double)getTwelve/rollNumber * 100 + "% \n");
				
	}

	
  public static void main(String[] args) {
	  
	  
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.println("Please enter number of times the dice will be rolled.");
			
			int rollNumber = s.nextInt();
			
			Random diceNumber = new Random();
			RollDice(rollNumber, diceNumber);
		
			System.out.println("Do you want to keep rolling? (Y/N)");
			
			if (s.next().equalsIgnoreCase("y")) {
				continue;
				
				}else {
					break;
			}
			
			
	   }	
    }
  }
