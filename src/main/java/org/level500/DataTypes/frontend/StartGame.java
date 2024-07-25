package org.level500.DataTypes.frontend;

import org.level500.DataTypes.engine.GuessNumber;

import java.util.Scanner;

public class StartGame {
    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber(5);
        String output = guessNumber.play();
        System.out.println(output);
    }
}
