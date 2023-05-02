package com.bridgelabz;

import java.util.Random
//As a Gambler, would start with a stake of $100 every day and bet $1 every game.
public class GamblingSimulation {
    public static void main(String[] args) {
        static int stackEveryDay = 100;
    static int betEveyGame = 1;

    public static void main(String[] args) {
        System.out.println("Gambling Simulation Problem");

        System.out.println("Stack of Every Day = " + stackEveryDay + "$");
        System.out.println("Bet Amount Every Game = " + betEveyGame + "$");

        int stackWon = 150;
        int stackLost = 50;
        System.out.println("Gambler if won ="+stackWon+"$");
        System.out.println("Gambler if loss ="+stackLost+"$");
        int totalAmount = 0;
        int winDays =0;
        int lostDays =0;


        for (int days = 1; days <= 30; days++) {
            stackEveryDay = 100;

            while (stackEveryDay > stackLost && stackEveryDay < stackWon) {

                Random random = new Random();
                int bet = random.nextInt(2);

                switch(bet) {
                    case 1:
                        stackEveryDay += betEveyGame;
                        break;
                    default:
                        stackEveryDay -= betEveyGame;
                        break;

                }
            }

            if(stackEveryDay == stackWon) {
                //System.out.println("Player Has Won Gambler For Day "+days);
                totalAmount += stackWon;
                winDays +=1;
            }else {
                //System.out.println("Player Has Loss Gambler For Day "+days);
                totalAmount -= stackLost;
                lostDays +=1;
            }
            
        }
        System.out.println("Winning Days : "+winDays+" days");
        System.out.println("Loosing Days : "+lostDays+" days");
        System.out.println("Total Win Price: "+totalAmount + "$");
    }
}
