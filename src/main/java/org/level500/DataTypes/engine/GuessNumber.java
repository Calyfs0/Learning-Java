package org.level500.DataTypes.engine;

import java.util.Scanner;

public class GuessNumber {
    private int numberOfTries;
    private int guessNumber;
    private int NumberOfTriesPlayed = 0;

    public GuessNumber(int numberOfTries) {
        if(numberOfTries < 1 || numberOfTries > 10){
            throw new IllegalArgumentException("Unfair number of tries. Choose a value between 1 and 10");
        }
        setNumberOfTries(numberOfTries);
        setGuessNumber();
    }

    public String play(){
        int number = getGuessNumber();
        int numberOfTries = getNumberOfTries();
        while(NumberOfTriesPlayed != numberOfTries){
            NumberOfTriesPlayed += 1;

            System.out.println("Guess a number between 1 and 10");
            Scanner sc = new Scanner(System.in);
            int guessedNumber = sc.nextInt();

            if(guessedNumber == number) {
                return("Congratulations. You guessed the correct number");
            }

        }
        return("You loose!");
    }

    private int getNumberOfTries() {
        return numberOfTries;
    }

    private void setNumberOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    private int getGuessNumber() {
        return guessNumber;
    }

    private void setGuessNumber() {
        this.guessNumber = RandomNumberGenerator.getRandomNumber();
    }
}
