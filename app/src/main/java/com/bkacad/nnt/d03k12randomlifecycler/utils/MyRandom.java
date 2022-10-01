package com.bkacad.nnt.d03k12randomlifecycler.utils;

import java.util.Random;

public class MyRandom {
    private MyRandom() {
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static String getColorString() {
        String chars = "ABCDEF01234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6) { // length of the random string.
            int index = (int) (rnd.nextFloat() * chars.length());
            salt.append(chars.charAt(index));
        }
        return "#" + salt;
    }
}
