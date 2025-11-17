package Loops;

import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        System.out.println("Welcome to search for the maximum value in an array.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum number is: " + max);
        sc.close();
    }
}


