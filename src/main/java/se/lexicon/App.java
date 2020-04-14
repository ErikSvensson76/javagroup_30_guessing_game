package se.lexicon;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        boolean keepAlive = true;
        while(keepAlive){
            System.out.print("Make a choice (1 play the game, Q quit) : ");
            String input = ScannerUtil.getUserInput();
            switch (input.toUpperCase()){
                case "1":
                    GuessingGame.play();
                    break;
                case "Q":
                    keepAlive = false;
                    break;
                default:
                    System.out.println("Unknown input " + input);
            } //Switch end
        }//while end
    }//main end
}
