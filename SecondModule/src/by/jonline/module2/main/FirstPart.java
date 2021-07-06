package by.jonline.module2.main;

import by.jonline.module2.controller.Output;
import by.jonline.module2.generator.ArrayGenerator;

public class FirstPart {

    public static int firstTask() {
        int result = 0;
        int K = 2;
        int[] array = ArrayGenerator.generateIntArray(10);

        for (int value : array) {
            if (value % K == 0) {
                result += value;
            }
        }

        return result;
    }

    //change with Z all elements that bigger than Z and return changes amount
    public static int secondTask() {
        int changesAmount = 0;
        double Z = 2.1;
        double[] array = ArrayGenerator.generateDoubleArray(10);

        System.out.println("Before:");
        Output.outputArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > Z) {
                array[i] = Z;
                changesAmount++;
            }
        }

        System.out.println("After:");
        Output.outputArray(array);

        return changesAmount;
    }

    //find amount of positive, negative and zero elements
    public static String thirdTask() {
        double[] array = ArrayGenerator.generateDoubleArray(10);
        Output.outputArray(array);

        int positiveAmount = 0;
        int negativeAmount = 0;
        int zeroAmount = 0;

        for (double value : array) {
            if (value > 0) {
                positiveAmount++;
            } else {
                if (value < 0) {
                    negativeAmount++;
                } else {
                    zeroAmount++;
                }
            }
        }

        return "Array contains:"
                + positiveAmount + " positive elements, "
                + negativeAmount + " negative elements, "
                + zeroAmount + " zero elements";

    }

    //swap max and min element
    public static void fourthTask() {
        double[] array = ArrayGenerator.generateDoubleArray(3);

        int maxElementIndex = 0;
        int minElementIndex = 0;

        System.out.println("Before: ");
        Output.outputArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxElementIndex]) {
                maxElementIndex = i;
            } else {
                if (array[i] < array[minElementIndex]) {
                    minElementIndex = i;
                }
            }
        }

        double T = array[maxElementIndex];
        array[maxElementIndex] = array[minElementIndex];
        array[minElementIndex] = T;

        System.out.println("After: ");
        Output.outputArray(array);
    }

    //find all elements that bigger than their index
    public static String fifthTask() {
        StringBuilder result = new StringBuilder();
        int[] array = ArrayGenerator.generateIntArray(10);
        Output.outputArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                result.append(array[i]).append(" ");
            }
        }

        return result.toString();
    }

    //find sum of elements with simple index
    public static double sixthTask() {
        double result = 0;
        double[] array = ArrayGenerator.generateDoubleArray(10);
        Output.outputArray(array);


        for (int i = 0; i < array.length; i++) {
            if (i > 2){
                if (isSimple(i)) {
                    result += array[i];
                }
            }
        }

        return result;
    }

    private static boolean isSimple(int number) {
        boolean isSimple = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }

        return isSimple;
    }

    //delete all min elements
    public static void eightTask(){
        int[] array = ArrayGenerator.generateIntArray(10);
        Output.outputArray(array);

        int minElement = array[0];
        int minElementAmount = 0;

        for (int value : array) {
            if (value < minElement) {
                minElement = value;
            }
        }

        for (int value : array) {
            if(value == minElement){
                minElementAmount++;
            }
        }

        int[] newArray = new int[array.length - minElementAmount];
        int j = 0;

        for (int value : array) {
            if (value != minElement) {
                newArray[j] = value;
                j++;
            }
        }

        Output.outputArray(newArray);
    }

    //find the most repeatable element or smallest of them
    public static int ninthTask(){
        int[] array = ArrayGenerator.generateIntArray(10);
        Output.outputArray(array);

        int resultElement = array[0];
        int biggestRepeatsAmount = 1;

        for (int i = 0; i < array.length; i++) {
            int thisRepeatsAmount = 1;
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j] && i != j){
                    thisRepeatsAmount++;
                }
            }

            if(thisRepeatsAmount > biggestRepeatsAmount){
                resultElement = array[i];
                biggestRepeatsAmount = thisRepeatsAmount;
            }
            else{
                if(thisRepeatsAmount == biggestRepeatsAmount){
                    if(array[i] < resultElement){
                        resultElement = array[i];
                        biggestRepeatsAmount = thisRepeatsAmount;
                    }
                }
            }
        }

        return resultElement;
    }

    //change every second element with 0
    public static void tenthTask(){
        int[] array = ArrayGenerator.generateIntArray(9);
        Output.outputArray(array);

        for (int i = 0; i < array.length; i += 2) {
            if(i > 0){
                array[i/2] = array[i];
            }
        }

        for (int i = array.length - 1; i > array.length / 2; i--) {
            array[i] = 0;
        }

        Output.outputArray(array);
    }
}


