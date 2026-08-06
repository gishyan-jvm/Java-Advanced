package com.arthur.edu.practic;

import java.util.Arrays;

public class DataAnalyzer {
    public Integer[][] sortMatrix(Integer[][] inputMatrix) {
        Integer[][] result = new Integer[inputMatrix.length][];

        for (int i = 0; i < inputMatrix.length; i++) {
            result[i] = Arrays.copyOf(inputMatrix[i], inputMatrix[i].length);
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length - 1; j++) {
                for (int k = 0; k < result[i].length - 1 - j; k++) {
                    if (result[i][k] > result[i][k + 1]) {
                        Integer temp = result[i][k];
                        result[i][k] = result[i][k + 1];
                        result[i][k + 1] = temp;
                    }
                }
            }
        }

        printMatrix(result);

        return result;
    }

    public static void printMatrix(Integer[][] matrix) {
        for (Integer[] integers : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(integers[j]);
            }
        }
        System.out.println();
    }
}
