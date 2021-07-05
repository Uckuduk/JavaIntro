package by.jonline.module1.main;

import static java.lang.Math.*;

public class BranchingProgram {
    //check if triangle exists
    public static void isTriangle() {
        int a = 30;
        int b = 40;

        if (180 - a - b > 0 && a > 0 && b > 0) {
            System.out.println("Triangle exists");
            if (isRightTriangle(a, b)) {
                System.out.println("This triangle is right");
            } else {
                System.out.println("This is random triangle");
            }
        } else {
            System.out.println("Triangle doesn't exist");
        }
    }

    //check if triangle has corner 90 degrees
    private static boolean isRightTriangle(int a, int b) {
        return a + b == 90;
    }

    //find max{min(a, b), min(c, d)}
    public static double secondTask() {
        double a = 3.1;
        double b = 4.6;
        double c = 1.6;
        double d = 0.1;

        if (a > b) {
            a = b;
        }

        if (c > d) {
            c = d;
        }

        if (a < c) {
            a = c;
        }

        return a;
    }

    //check if 3 points lays in 1 line
    public static boolean thirdTask() {
        int x1 = -1;
        int y1 = -1;
        int x2 = 2;
        int y2 = 2;
        int x3 = 5;
        int y3 = 5;

        boolean result = false;

        if (x1 != x2 && x2 != x3 && y1 != y2 && y2 != y3) {
            if (abs(y2 - y1) / abs(x2 - x1) == abs(y3 - y2) / abs(x3 - x2)) {
                result = true;
            }
        }

        return result;
    }

    public static boolean fourthTask() {
        final int A = 5;
        final int B = 7;

        boolean result = false;

        int x = 3;
        int y = 6;
        int z = 8;

        int x1 = min(min(x, y), min(y, z));
        int x2 = max(min(x, y), min(y, z));

        if (x1 <= min(A, B)) {
            if (x2 <= max(A, B)) {
                result = true;
            }
        }

        return result;
    }

    //calculate function
    public static double fifthTask() {
        double x = 1;
        double result;

        if (x <= 3) {
            result = pow(x, 2) - 3 * x + 9;
        } else {
            result = 1 / (pow(x, 3) + 6);
        }

        return result;
    }
}
