package by.jonline.module2.controller;

public class Output {
    public static void outputArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void outputArray(double[] array) {
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void outputMatrix(int[][] array) {
        for (int[] arr : array) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

