package com.snakeLadder;

import java.util.Random;

public class snakeLadder {
	public static void main(String[] args) {
		int position = 0;  //initial position
		final int winningPosition = 100;  //winning position

        //using while loop
		while (position <= winningPosition) {
			Random rand = new Random(); //random function for taking random numbers
            int dicevalue = rand.nextInt(6) + 1; //it gives random numbers between 1 to 6
            System.out.println("Dice Value is ==> " + dicevalue);
            int option = rand.nextInt(3); //for taking 3 random numbers for taking option
            if(position == winningPosition) {
            	System.out.println("You Won The Game!!!!");
            	break;
            }
            
            switch(option) {
            case 0:
            	System.out.println("No Play");
            	break;
            case 1:
                System.out.println("Ladder");
                position += dicevalue; //add dice value in position 
                System.out.println("Current Position is ==>" + position);
                     if(position > 100) {
                     	position = position - dicevalue;
                     	System.out.println("Current Position is " +position);
                     }
                break;
            case 2:
            	System.out.println("Snake");
                position -= dicevalue;  //sub dice value from position
                System.out.println("Current Position is ==>" + position);

                if (position < 0) {
                    position = 0;
                    System.out.println("Current Position is ==>" + position);
                	}
            }
		}
    }
}