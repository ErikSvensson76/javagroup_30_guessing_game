package se.lexicon;

import org.junit.Assert;
import org.junit.Test;

public class GuessingGameTest {

    @Test
    public void given_guess_low_and_secretNumber_evaluateGuess_return_false(){
        int guess = 89, secretNumber = 90;

        Assert.assertFalse(GuessingGame.evaluateGuess(guess,secretNumber));
    }

    @Test
    public void given_guess_high_and_secretNumber_evaluateGuess_return_false(){
        int guess = 91, secretNumber = 90;

        Assert.assertFalse(GuessingGame.evaluateGuess(guess,secretNumber));
    }

    @Test
    public void given_correct_guess_and_secretNumber_evaluateGuess_return_true(){
        int guess = 90, secretNumber = 90;
        Assert.assertTrue(GuessingGame.evaluateGuess(guess,secretNumber));
    }


}
