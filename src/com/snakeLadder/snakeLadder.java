package com.snakeLadder;

import java.util.Random;

public class snakeLadder {
	public static void main(String[] args) {
		//variables
        int positionP1 = 0;
        int positionP2 = 0;
        int diceRoll1 = 0;
        int diceRoll2 = 0;
        final int winningposition = 100;

        //using while loop
        while(positionP1 <= winningposition  && positionP2 <= winningposition) {
        	Random rand = new Random();
            int diceValue1 = rand.nextInt(6)+1;
            System.out.println("PLAYER1 ");
            System.out.println("Dice Value is " +diceValue1);
            int option = rand.nextInt(3);

            //check condition in switch
            diceRoll1++;
            if(positionP1 == winningposition) {
                System.out.println("Player 1 Won The Game");
                break;
            }
            switch(option) {
                case 0:
                    System.out.println("No Play");
                    break;
                case 1:
                    System.out.println("Ladder");
                    positionP1 += diceValue1;
                    System.out.println("Current Position is ==>" + positionP1);

                    if(positionP1 > 100) {
                        positionP1 = positionP1 - diceValue1;
                        System.out.println("Current Position is ==>" + positionP1);
                    }
                    break;
                case 2:
                    System.out.println("Snake");
                    positionP1 -= diceValue1;
                    System.out.println("Current Position is ==>" + positionP1);

                    if(positionP1 < 0) {
                        positionP1 = 0;
                        System.out.println("Current Position is " + positionP1);
                    }
                    break;
                default:
                	System.out.println("Not Correct");
            }
            System.out.println("Dice Roll Count for Player1 "+diceRoll1);
            System.out.println("-----------------------------------------------------");

            //player2

            
            int diceValue2 = rand.nextInt(6)+1;
            System.out.println("PLAYER2 ");
            System.out.println("Dice Value is " +diceValue2);
            int option2 = rand.nextInt(3);
            diceRoll2++;
            if(positionP2 == winningposition){
                System.out.println("Player 2 Won The Game");
                break;
            }
            switch(option2) {
                case 0:
                    System.out.println("No Play");
                    break;
                case 1:
                    System.out.println("Ladder");
                    positionP2 += diceValue2;
                    System.out.println("Current Position is ==>" + positionP2);

                    if(positionP2 > 100) {
                        positionP2 = positionP2 - diceValue2;
                        System.out.println("Current Position is ==>" + positionP2);
                    }
                    break;
                case 2:
                    System.out.println("Snake");
                    positionP2 -= diceValue2;
                    System.out.println("Current Position is ==>" + positionP2);

                    if(positionP2 < 0) {
                        positionP2 = 0;
                        System.out.println("Current Position is ==>" + positionP2);
                    }
                    break;
                default:
                    System.out.println("Not Correct");

            }
            System.out.println("Dice Roll Count for Player2 "+diceRoll2);
            System.out.println("-------------------------------------------------");

        }

        if(positionP1==winningposition)
            System.out.println("Player 1 Won The Game");
        else
        	System.out.println("Player 2 Won The Game");
    }
/*	public static void main(String[] args) {
		int positionP1 = 0; //initial positionP1
		int positionP2 = 0;
		int winningposition = 100;  //winning position
		int diceRollCount1=0;
		int diceRollCount2=0;

        //using while loop
		while (positionP1 <= winningposition && positionP2 <= winningposition) {
			Random rand = new Random(); //random function for taking random numbers
            int dicevalue = rand.nextInt(6) + 1; //it gives random numbers between 1 to 6
            System.out.println("Dice Value is ==> " + dicevalue);
            int option = rand.nextInt(3); //for taking 3 random numbers for taking option
            if(positionP1 == winningposition) {
            	System.out.println("You Won The Game!!!!");
            	break;
            }
            
            switch(option) {
            case 0:
            	System.out.println("No Play");
            	break;
            case 1:
                System.out.println("Ladder");
                positionP1 += dicevalue; //add dice value in positionP1 
                System.out.println("Current positionP1 is ==>" + positionP1);
                     if(positionP1 > 100) {
                     	positionP1 = positionP1 - dicevalue;
                     	System.out.println("Current positionP1 is " +positionP1);
                     }
                break;
            case 2:
            	System.out.println("Snake");
                positionP1 -= dicevalue;  //sub dice value from positionP1
                System.out.println("Current positionP1 is ==>" + positionP1);

                if (positionP1 < 0) {
                    positionP1 = 0;
                    System.out.println("Current positionP1 is ==>" + positionP1);
                	}
            }
            diceRollCount1++;
            System.out.println("How Many Times Dice Roll " +diceRollCount1);
            
            
            Random rand2 = new Random(); //random function for taking random numbers
            int dicevalue2 = rand2.nextInt(6) + 1; //it gives random numbers between 1 to 6
            System.out.println("Dice Value is ==> " + dicevalue);
            int option2 = rand2.nextInt(3); //for taking 3 random numbers for taking option
            if(positionP2 == winningposition) {
            	System.out.println("You Won The Game!!!!");
            	break;
            }
            
            switch(option2) {
            case 0:
            	System.out.println("No Play");
            	break;
            case 1:
                System.out.println("Ladder");
                positionP2 += dicevalue; //add dice value in position 
                System.out.println("Current Position is ==>" + positionP2);
                     if(positionP2 > 100) {
                     	positionP2 = positionP2 - dicevalue2;
                     	System.out.println("Current Position is " +positionP2);
                     }
                break;
            case 2:
            	System.out.println("Snake");
                positionP2 -= dicevalue;  //sub dice value from position
                System.out.println("Current Position is ==>" + positionP2);

                if (positionP2 < 0) {
                    positionP2 = 0;
                    System.out.println("Current Position is ==>" + positionP2);
                	}
            }
            diceRollCount2++;
            System.out.println("How Many Times Dice Roll " +diceRollCount2);
		}
		if(positionP1 == winningposition) {
            System.out.println("Congrats Player 1  You Won The Game");
		} else {
        	System.out.println("Congrats Player 2  You Won The Game");
		}
    } */
}