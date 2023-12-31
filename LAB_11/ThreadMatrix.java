package LAB_11;

import java.util.Scanner;

class Matrix {
    static int[][] matrix;

    Matrix(int rows, int columns) {
        matrix = new int[rows][columns];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}

class DisplayMatrixThread extends Thread {
    static int[][] matrix;

    DisplayMatrixThread(Matrix matrixObj) {
        matrix = Matrix.matrix;
    }

    public void run() {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}

class TransposeMatrixThread extends Thread {
    static int[][] matrix;

    TransposeMatrixThread(Matrix matrixObj) {
        matrix = Matrix.matrix;
    }

    public void run() {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class MaxValueThread extends Thread {
    static int[][] matrix;

    MaxValueThread(Matrix matrixObj) {
        matrix = Matrix.matrix;
    }

    public void run() {
        int max = matrix[0][0];

        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }

        System.out.println("Maximum value in the matrix: " + max);
    }
}

class PrincipalDiagonalThread extends Thread {
    static int[][] matrix;

    PrincipalDiagonalThread(Matrix matrixObj) {
        matrix = Matrix.matrix;
    }

    public void run() {
        int rows = matrix.length;
        int columns = matrix[0].length;

        System.out.print("Principal Diagonal Elements: ");
        for (int i = 0; i < Math.min(rows, columns); i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }
}

class NonDiagonalThread extends Thread {
    static int[][] matrix;
    NonDiagonalThread(Matrix matrixObj) {
        matrix = Matrix.matrix;
    }

    public void run() {
        int rows = matrix.length;
        int columns = matrix[0].length;

        System.out.print("Non-Diagonal Elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i != j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}

public class ThreadMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        Matrix matrixObj = new Matrix(rows, columns);

        DisplayMatrixThread t1 = new DisplayMatrixThread(matrixObj);
        TransposeMatrixThread t2 = new TransposeMatrixThread(matrixObj);
        MaxValueThread t3 = new MaxValueThread(matrixObj);
        PrincipalDiagonalThread t4 = new PrincipalDiagonalThread(matrixObj);
        NonDiagonalThread t5 = new NonDiagonalThread(matrixObj);

        try {
            t1.start();
            System.out.println("\nThread t1 is alive: " + t1.isAlive());
            t1.join();
            t2.start();
            System.out.println("\nThread t2 is alive: " + t2.isAlive());
            t2.join();
            t3.start();
            System.out.println("\nThread t3 is alive: " + t3.isAlive());
            t3.join();
            t4.start();
            System.out.println("\nThread t4 is alive: " + t4.isAlive());
            t4.join();
            t5.start();
            System.out.println("\nThread t5 is alive: " + t5.isAlive());
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nThread t1 is alive: " + t1.isAlive());
        System.out.println("Thread t2 is alive: " + t2.isAlive());
        System.out.println("Thread t3 is alive: " + t3.isAlive());
        System.out.println("Thread t4 is alive: " + t4.isAlive());
        System.out.println("Thread t5 is alive: " + t5.isAlive());

        System.out.println("\nMain thread exits.");
    }
}