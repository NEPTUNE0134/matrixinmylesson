package melih;

import java.util.Random;

public class MatrixMultiplicationrandom {
    public static void main(String[] args) {
        
        int rowsA = 2;
        int colsA = 2;
        int rowsB = 2;
        int colsB = 2;

        
        int[][] matrixA = generateRandomMatrix(rowsA, colsA);
        int[][] matrixB = generateRandomMatrix(rowsB, colsB);

        
        int[][] multipliedMatrix = multiplyMatrices(matrixA, matrixB);

        
        int sum = sumMatrixElements(multipliedMatrix);

        
        System.out.println("Matris A:");
        printMatrix(matrixA);
        System.out.println("Matris B:");
        printMatrix(matrixB);
        System.out.println("Çarpım Sonucu Matris:");
        printMatrix(multipliedMatrix);
        System.out.println("Elemanların Toplamı: " + sum);
    }

    
    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);         }
        }
        return matrix;
    }

    
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    
    public static int sumMatrixElements(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}