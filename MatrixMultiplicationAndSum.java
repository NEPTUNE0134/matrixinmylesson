package mel;

import java.util.Random;

public class MatrixMultiplicationAndSum {
    public static void main(String[] args) {
        int size = 2; 
        int[][] matrixA = generateRandomMatrix(size);
        int[][] matrixB = generateRandomMatrix(size);
        int[][] resultMatrix = new int[size][size];

       
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

       
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += resultMatrix[i][j];
            }
        }

               System.out.println("Matrix multiplication result:");
        printMatrix(resultMatrix);
        System.out.println("Sum of the Elements of the Result Matrix: " + sum);
    }

    
    public static int[][] generateRandomMatrix(int size) {
        int[][] matrix = new int[size][size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(10);           }
        }
        return matrix;
    }

       public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}