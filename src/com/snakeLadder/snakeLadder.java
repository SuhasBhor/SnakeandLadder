package com.snakeLadder;

import java.util.Random;

public class snakeLadder {
	public static void main(String[] args) {
		System.out.println("Welcome To Snake and Ladder Game");
		int position=0;
		Random rand = new Random();
		int dicevalue=rand.nextInt(6)+1;
		System.out.println("Player Position is at " +position);
		System.out.println("Dice Value is " +dicevalue);
		System.out.println("Player should move " +dicevalue +" place");
	}
}
