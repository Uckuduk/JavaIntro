package by.jonline.module1.main;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.Math.*;

public class CyclingProgram {

    //calculate sum from 1 to number
    public static int firstTask(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            sum += i;
        }

        return sum;
    }

    //calculate function values on segment
    public static void secondTask() {
        double a = 1.7;
        double b = 2.4;
        double h = 0.1;

        while (a <= b) {
            if (a <= 2) {
                System.out.println(-a);
            } else {
                System.out.println(a);
            }

            a += h;
        }
    }


    public static int thirdTask(){
        int result = 0;

        for(int i = 1; i <= 100; i++){
            result += pow(i, 2);
        }

        return  result;
    }


    public static int fourthTask(){
        int result = 1;

        for(int i = 1; i <= 200; i++){
            result *= pow(i, 2);
        }

        return result;
    }

    public static double fifthTask(){
        double result = 0;
        double e = 0.1;

        double value = (1 / 2.0) + (1 / 3.0);

        for (int i = 2; value >= e; i++) {
            result += value;
            value = (1 / pow(2, i)) + (1 / pow(3, i));
        }

        return result;
    }

    public static void sixthTask(){
        char symbol;

        for (int i = 1; i <= 225; i++) {
            symbol = (char) i;

            System.out.print(symbol + " ");

            if(i % 15 == 0){
                System.out.println("\n");
            }
        }
    }

    public static void seventhTask(int m, int n){
        int start = min(m, n);
        int end = max(m,n);
        boolean find = false;
        StringBuilder answer;

        for (int i = start; i <= end; i++) {

            answer = new StringBuilder(i + ": ");
            find = false;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    answer.append(j).append(" ");
                    find = true;
                }
            }

            if(!find){
                answer.append("-");
            }

            System.out.println(answer);
        }
    }

    public static String eightTask(){
        int number1 = 1234;
        int number2 = 78241;

        StringBuilder result = new StringBuilder();

        String[] strNumber1 = convertIntToStringArray(number1);
        String[] strNumber2 = convertIntToStringArray(number2);

        for (String s : strNumber1) {
            for (String value : strNumber2) {
                if (s.equals(value)) {
                    result.append(s).append(" ");
                }
            }
        }

        return result.toString();
    }

    private static String[] convertIntToStringArray(int number){
        int numberCopy = number;
        int length = 0;

        while(numberCopy >= 1){
            length += 1;
            numberCopy /= 10;
        }

        String[] string = new String[length];

        for (int i = length - 1; i >= 0; i--) {
            string[i] = String.valueOf(number % 10);
            number /= 10;
        }

        return  string;
    }
}
