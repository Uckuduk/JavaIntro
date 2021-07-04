package by.jonline.module1.controller;

import java.util.Scanner;

public class Controller {

    public static int input(){
        int number;
        Scanner in = new Scanner(System.in);

        while (true) {

            if (in.hasNextInt()) {
                number = in.nextInt();

                if (number > 1) {
                    break;
                } else {
                    System.out.println("Bad data! Number must be bigger than 1!\n"
                            + "Try again");
                }

            } else {
                in.next();
                System.out.println("Bad data! Number must be integer!\n"
                        + "Try again");
            }

        }

        return number;
    };
}
