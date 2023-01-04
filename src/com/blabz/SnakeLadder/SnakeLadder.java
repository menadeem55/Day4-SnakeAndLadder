package com.blabz.SnakeLadder;

import java.util.Random;

public class SnakeLadder {
	public static void main(String[] args) {
		int start = 0;
		int userPosition = 0;
		int count = 0;
		
		//print the starting position 
		System.out.println("Player Starting Position will be:~ ");
		System.out.println(+start);   //just print out to start value
		
		/*
		 *create instance of random class
		 *Then Invoke methods
		 *Generate numbers in the range 1to6
		 * print dice roll result
		 * Checked the condition user position
		 */
		Random random = new Random();     //create an random object
		while (userPosition != 100) {     //Checking position is not equal to 100
			count++;
		
		int dice = random.nextInt(6)+1;   //Invoke methods and generating numbers
		System.out.println("dice roll result: "+dice);  //print dice roll result
	    
		int cases = random.nextInt(3); //generating number between 0to3
		
		switch (cases) { //Using switch keyword
		case 0:
			System.out.println("No Play!!");   //print statement to be executed
			break;    //break out of the switch block
			
		case 1:
			System.out.println("Ladder!");   //print statement to be executed
			userPosition = userPosition + dice; 
			if(userPosition > 100)     // To check condition is grater
			{
				userPosition = dice;
			}
			break;
			
		default:  
			System.out.println("Snake!");
			userPosition = userPosition - dice;
			
			if (userPosition < 0) {
				userPosition = 0;
			}
		}System.out.println("Number of times user played "+count+" to reach: "+userPosition);  //Print the how many times user played and to reach
		System.out.println("Presnt Position of the User: " + userPosition); //printing present position
	}
	System.out.println("User has rolled "+count+" times to win!"); //printing the user rolled how many time to win
	
	}
		
}