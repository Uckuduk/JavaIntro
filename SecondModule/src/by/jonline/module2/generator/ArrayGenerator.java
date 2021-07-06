package by.jonline.module2.generator;

import by.jonline.module2.main.Main;

import java.util.Random;

public class ArrayGenerator {
    public static int[] generateIntArray(int length){
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        return array;
    }

    public static double[] generateDoubleArray(int length){
        double[] array = new double[length];

        for (int i = 0; i < length; i++) {
            array[i] = Math.random() * 11 - 5;
        }

        return array;
    }
}
