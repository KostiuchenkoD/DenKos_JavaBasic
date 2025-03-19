package org.KostiuchenkoD.Lab2;

import java.util.Random;
import java.util.Scanner;

public class Lab2 {

    private static final int RANDOM_MIN = -100;
    private static final int RANDOM_MAX = 100;
    private static final int MAX_SIZE = 20;

    public static void start() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть ширину матриці (не більше 20): ");
            int width = scanner.nextInt();
            System.out.print("Введіть висоту матриці (не більше 20): ");
            int height = scanner.nextInt();

            if (width > MAX_SIZE || height > MAX_SIZE) {
                System.out.println("Розмір матриці не може перевищувати 20x20.");
                return;
            }

            System.out.print("Введіть '1' для ручного введення або '2' для випадкового заповнення: ");
            int choice = scanner.nextInt();

            int[][] matrix;
            if (choice == 1) {
                matrix = createMatrixManually(width, height, scanner);
            } else {
                matrix = createMatrixRandomly(width, height);
            }

            printMatrix(matrix);

            int min = findMin(matrix);
            int max = findMax(matrix);
            double avg = calculateAverage(matrix);

            System.out.println("Мінімальне значення: " + min);
            System.out.println("Максимальне значення: " + max);
            System.out.println("Середнє значення: " + avg);
        }

        private static int[][] createMatrixManually(int width, int height, Scanner scanner) {
            int[][] matrix = new int[height][width];
            System.out.println("Введіть елементи матриці:");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("Елемент [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
            return matrix;
        }

        private static int[][] createMatrixRandomly(int width, int height) {
            Random random = new Random();
            int[][] matrix = new int[height][width];

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = random.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN;
                }
            }
            return matrix;
        }

        private static void printMatrix(int[][] matrix) {
            System.out.println("Матриця:");
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + "\t");
                }
                System.out.println();
            }
        }

        private static int findMin(int[][] matrix) {
            int min = matrix[0][0];
            for (int[] row : matrix) {
                for (int num : row) {
                    if (num < min) {
                        min = num;
                    }
                }
            }
            return min;
        }

        private static int findMax(int[][] matrix) {
            int max = matrix[0][0];
            for (int[] row : matrix) {
                for (int num : row) {
                    if (num > max) {
                        max = num;
                    }
                }
            }
            return max;
        }

        private static double calculateAverage(int[][] matrix) {
            int sum = 0, count = 0;
            for (int[] row : matrix) {
                for (int num : row) {
                    sum += num;
                    count++;
                }
            }
            return (double) sum / count;
        }
}
