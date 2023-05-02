package com.bridgelabz;

import java.util.Random
//As a Gambler, would start with a stake of $100 every day and bet $1 every game.
public class GamblingSimulation {
    public static void main(String[] args) {
    static int stackEveryDay = 100;
    static int betEveyGame = 1;
    static int win =0;
    static int lose =0;
    static int winMax = 0;
    static int losMax = 0;
    static int luckyDay;
    static int unluckyDay;

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

            if(win > winMax) {
                winMax = win;
                luckyDay = days ;
            }
            if(lose > losMax) {
                losMax = lose;
                unluckyDay = days;
            }
        }
        System.out.println("Winning Days : "+winDays+" days");
        System.out.println("Loosing Days : "+lostDays+" days");
        System.out.println("Total Win Price: "+totalAmount + "$");
        System.out.println("The Luckiest Day is "+luckyDay);
        System.out.println("The Unluckiest Day is "+unluckyDay);
    }
}
