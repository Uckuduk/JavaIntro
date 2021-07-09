package by.jonline.module2.generator;

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
            array[i] = (double) Math.round((Math.random() * 11 - 5) * 100) / 100;
        }

        return array;
    }
}
