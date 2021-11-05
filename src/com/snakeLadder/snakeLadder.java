package com.snakeLadder;

import java.util.Random;

public class snakeLadder {
	public static void main(String[] args) {
		int position = 0;  //initial position
		final int WINNING_POSITION = 100;  //winning position

        //using while loop
		while (position <= WINNING_POSITION) {
			Random rand = new Random(); //random function for taking random numbers
            int diceValue = rand.nextInt(6) + 1; //it gives random numbers between 1 to 6
            System.out.println("Dice Value is ==> " + diceValue);
            int option = rand.nextInt(3); //for taking 3 random numbers for taking option

            if (option == 0) {
            	System.out.println("No Play");
            }else if (option == 1) {
                System.out.println("Ladder");
                position += diceValue; //add dice value in position 
                System.out.println("Current Position is ==>" + position);
            }else if (option == 2) {
                System.out.println("Snake");
                position -= diceValue;  //sub dice value from position
                System.out.println("Current Position is ==>" + position);

                if (position < 0) {
                    position = 0;
                    System.out.println("Current Position is ==>" + position);
                }
            }
        }
    }
}