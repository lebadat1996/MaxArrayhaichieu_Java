package Array2chieu;

import java.util.Scanner;

public class SumColArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n: ");
        double n = scanner.nextInt();
        System.out.print("enter m: ");
        double m = scanner.nextInt();
        double[][] array = inputArray(n, m, scanner);
        System.out.print("enter K: ");
        int k = scanner.nextInt();
        sumCol(array, k);

    }

    public static double[][] inputArray(double n, double m, Scanner scanner) {
        double[][] array = new double[(int) n][(int) m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    public static void sumCol(double[][] arr2dim, int noCol) {
        int sum = 0;
        for (int i = 0; i < arr2dim.length; i++) {
            for (int j = 0; j < arr2dim[i].length; j++) {
                if (j == noCol - 1) {
                    sum += arr2dim[i][j];
                }
            }
        }
        System.out.println("SumCol " + noCol + " la: " + sum);
    }
}


