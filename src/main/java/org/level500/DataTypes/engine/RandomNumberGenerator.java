package org.level500.DataTypes.engine;

import java.util.Random;

class RandomNumberGenerator {
    private int randomNumber;

    public static int getRandomNumber(){
       return (int)(Math.random() * 10 + 1);
    }
}
