package com.bridgelabz;
//As a Gambler, would start with a stake of $100 every day and bet $1 every game.

public class GamblingSimulation {
    public static void main(String[] args) {
       System.out.println(" Gambling Simulation Problem ");

        //Initializing Stack of Every day and Bet Amount

        System.out.println("Stack of Every Day = " + stackEveryDay + "$");
        System.out.println("Bet Amount Every Game = " + betEveyGame + "$");

        Random random =new Random();
        int bet = random.nextInt(2);
        if (bet == 1) {
            System.out.println("Gambler Bet WINS");

            stackEveryDay += betEveyGame;       //When the Bet wins Bet amount is added to Stack of Everyday

            System.out.println("Final Stack when Bet Wins = "+stackEveryDay+"$");
        }else {
            System.out.println("Gambler Bet Lose");

            stackEveryDay -= betEveyGame;       //When the Bet loose Stack of Every day is deducted by bet amount

            System.out.println("Final Stack when Bet Lose = "+stackEveryDay+"$");
        }
    }
}
}
