package Array2chieu;

import java.util.Scanner;

public class maxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scanner.nextInt();
        System.out.print("enter m: ");
        int m = scanner.nextInt();
        int[][] array = inputArray(n, m, scanner);
        maxArray(array);
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

    public static int maxArray(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print("max = " + max);
        return max;
    }
}
