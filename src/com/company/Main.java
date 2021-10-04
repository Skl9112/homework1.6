package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] firstMatrix = {{2, 2, 2}, {4, 3, 2}, {2, 0, 2}};
        int[][] secondMatrix = {{1, 3, 2}, {4, 3, 2}, {2, 0, 2}};

        System.out.println("1st matrix: ");
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix.length; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("2nd matrix: ");
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++) {
                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix sum: ");
        int[][] sumOfFirstMatrixAndSecondMatrix = new int[firstMatrix.length][firstMatrix.length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++) {
                sumOfFirstMatrixAndSecondMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                System.out.print(sumOfFirstMatrixAndSecondMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("1st matrix minus 2nd matrix: ");
        int[][] firstMatrixMinusSecondMatrix = new int[firstMatrix.length][secondMatrix.length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++) {
                firstMatrixMinusSecondMatrix[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
                System.out.print(firstMatrixMinusSecondMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("2nd matrix minus 1st matrix: ");
        int[][] secondMatrixMinusFirstMatrix = new int[firstMatrix.length][secondMatrix.length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++) {
                secondMatrixMinusFirstMatrix[i][j] = secondMatrix[i][j] - firstMatrix[i][j];
                System.out.print(secondMatrixMinusFirstMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
