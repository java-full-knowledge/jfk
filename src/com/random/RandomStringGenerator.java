package com.random;

import java.util.Random;

public class RandomStringGenerator {

    private static Random random = new Random();

    public static void main(String[] args) {

        System.out.println(generate(12));

        //0-9 48-57
        //low alph 97-122
        //up alph 65-90

    }

    public static String generate(int symbolCount) {
        int numbersMin = 48;
        int numberMax = 57;

        int lowAlphMin = 97;
        int lowAlphMax = 122;

        int upAlphMin = 65;
        int upAlphMax = 90;

        StringBuilder builder = new StringBuilder();
        int i = 0;
        int[] generatedNumbers = new int[3];
        while (i < symbolCount) {
            generatedNumbers[0] = randNumberInRang(numbersMin, numberMax);
            generatedNumbers[1] = randNumberInRang(lowAlphMin, lowAlphMax);
            generatedNumbers[2] = randNumberInRang(upAlphMin, upAlphMax);
            int selector = generatedNumbers[randNumberInRang(0, 3)];
            builder.append((char) selector);
            i++;
        }
        return builder.toString();
    }

    private static int randNumberInRang(int min, int max) {
        return random.nextInt(max - min) + min;
    }
}



























