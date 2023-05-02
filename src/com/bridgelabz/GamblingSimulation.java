package com.bridgelabz;

import java.util.Random;

//As a Gambler, would start with a stake of $100 every day and bet $1 every game.

public class GamblingSimulation {
    static int stackEveryDay = 100;
    static int betEveyGame = 1;
    
    public static void main(String[] args) {
           System.out.println(" Gambling Simulation Problem ");

        //Initializing Stack of Every day and Bet Amount

        System.out.println("Stack of Every Day = " + stackEveryDay + "$");
        System.out.println("Bet Amount Every Game = " + betEveyGame + "$");


        //Initializing 50% of the Everyday Stock Won and Lost

        int stackWon = 150;
        int stackLost = 50;
        int totalAmount=0;

        //Gambler if won or lost 50% of the stake, would resign for the day (UC3)

        for (int days = 1; days <= 20; days++) {
            stackEveryDay = 100;

        while (stackEveryDay > stackLost && stackEveryDay < stackWon) {

            // Gambler make $1 bet either win or loose $1 (UC2).
            //Using Random to find the Bet wins or lose.

            Random random = new Random();
            int bet = random.nextInt(2);

            switch (bet) {
                case 1:
                    //When the Bet wins Bet amount is added to Stack of Everyday
                    stackEveryDay += betEveyGame;
                    break;
                default:
                       
                     //When the Bet loose Stack of Every day is deducted by bet amount
                        
                       stackEveryDay -= betEveyGame;
                       break;

            }
        }

            if(stackEveryDay == stackWon) {
                System.out.println("Player Has Won Gambler For Day "+days);
                totalAmount += stackWon;
            }else {
                System.out.println("Player Has Loss Gambler For Day "+days);
                totalAmount -= stackLost;
            }
            System.out.println("Total Win Price: "+totalAmount + "$");
            }
        }
}
