package by.jonline.module2.generator;

public class MatrixGenerator {

    public static int[][] generateIntMatrix(int rowsAmount, int columnsAmount){
        int[][] array = new int[rowsAmount][columnsAmount];

        for (int i = 0; i < rowsAmount; i++) {
            for (int j = 0; j < columnsAmount; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return array;
    }

    public static int[][] generateIntMatrix(int size){
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return array;
    }
}
