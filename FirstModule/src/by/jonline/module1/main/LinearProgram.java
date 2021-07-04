package by.jonline.module1.main;

import static java.lang.Math.*;

public class LinearProgram {

    public static double firstTask() {
        double a = 2.3;
        double b = 3.1;
        double c = 1.5;

        return ((a - 3) * b / 2) + c;
    }

    public static double secondTask() {
        double a = 4.7;
        double b = 6.2;
        double c = 2.5;

        return (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) + pow(b, -2);
    }

    public static double thirdTask() {
        double x = 2.7;
        double y = 3.6;

        return (sin(x) + cos(y)) / (cos(x) - sin(y)) * log10(x * y);
    }

    //change integer end decimal part
    public static String fourthTask() {
        double R = 123.456;

        String[] number = String.valueOf(R).split("\\.");

        return number[1] + "." + number[0];
    }

    //seconds in hours, minutes and seconds
    public static String fifthTask() {
        int T = 33333;
        int hours = T / 3600;
        int minutes = (T - (hours * 3600)) / 60;
        int seconds = T - hours * 3600 - minutes * 60;

        return hours + "ч " + minutes + "мин " + seconds + "c";
    }

    public static void sixthTask() {

    }
}

