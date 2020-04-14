package se.lexicon;

import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    public static boolean play(){
        boolean winner = false;
        int maxGuesses = 5;
        int secretNumber = ThreadLocalRandom.current().nextInt(1, 100 + 1);

        for(int guess = 0; guess < maxGuesses; guess++){
            System.out.println("Guess " + (guess+1) + " of "  + maxGuesses);
            System.out.print("Guess a number between 1 and 100: ");
            int numberGuess = ScannerUtil.getIntegerFromUser();
            if(evaluateGuess(numberGuess, secretNumber)){
                break;
            }
        }
        return winner;
    }

    public static boolean evaluateGuess(int guess, int secretNumber){
        if(guess < secretNumber){
            System.out.println("Your guess was too low");
            return false;
        }else if(guess > secretNumber){
            System.out.println("Your guess was too high");
            return false;
        }else {
            System.out.println("Your guess was correct: " + secretNumber);
            return true;
        }
    }
}
