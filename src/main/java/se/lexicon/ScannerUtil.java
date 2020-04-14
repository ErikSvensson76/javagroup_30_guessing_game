package se.lexicon;

import java.util.Scanner;

public class ScannerUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static String getUserInput(){
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static int getIntegerFromUser(){
        boolean invalidInt = true;
        int number = 0;
        while(invalidInt){
            try{
                String numberAsString = getUserInput().trim();
                number = Integer.valueOf(numberAsString);
                invalidInt = false;
            }catch (NumberFormatException ex){
                System.out.println(ex);
            }
        }
        return number;
    }
}
