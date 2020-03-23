package Array2chieu;

import java.util.Scanner;

public class minInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scanner.nextInt();
        System.out.print("enter m: ");
        int m = scanner.nextInt();
        int[][] array = inputArray(n, m, scanner);
        minArray(array);
    }

    public static int[][] inputArray(int n, int m, Scanner scanner) {
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
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

    public static int minArray(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.print("min = " + min);
        return min;
    }
}
