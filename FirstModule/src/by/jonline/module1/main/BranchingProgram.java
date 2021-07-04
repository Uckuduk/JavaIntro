package by.jonline.module1.main;

public class BranchingProgram {
    //check if triangle exists
    public static void isTriangle() {
        int a = 30; int b = 40;

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



}
