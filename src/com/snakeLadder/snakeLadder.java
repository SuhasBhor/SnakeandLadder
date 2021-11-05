package com.snakeLadder;

import java.util.Random;

public class snakeLadder {
	public static void main(String[] args) {
		System.out.println("Welcome To Snake and Ladder Game");
		int position=6;
		Random rand = new Random();
		int dicevalue=rand.nextInt(6)+1;
		System.out.println("Player Initial Position is at " +position);
		System.out.println("Dice Value is " +dicevalue);
		
		int option = rand.nextInt(3);
		if (option == 0) {
			System.out.println("No Play. Stay in Same Place");
		}else if(option == 1){
			System.out.println("Ladder");
			position += dicevalue;
			System.out.println("Current Position is " +position);
		}else {
			System.out.println("Snake");
			position -= dicevalue;
			System.out.println("Current Position is " +position);
		}
	}
}
