package by.jonline.module2.main;

import by.jonline.module2.controller.Output;
import by.jonline.module2.generator.MatrixGenerator;

public class SecondPart {

    public static void firstTask(){
        boolean isFound = false;
        int[][] array = MatrixGenerator.generateIntMatrix(3,5);

        Output.outputMatrix(array);

        for(int i = 0; i < array[0].length; i++){
            if(i % 2 == 0){
                if(array[0][i] > array[array.length - 1][i]){
                    for (int j = 0; j < array.length; j++){
                        System.out.print(array[j][i] + " ");
                    }

                    isFound = true;
                    System.out.println();
                }
            }
        }

        if(!isFound){
            System.out.println("No such column!");
        }
    }
}
