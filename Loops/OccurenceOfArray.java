package Loops;

import java.util.Scanner;

public class OccurenceOfArray {
    public static void main(String[] args) {
        System.out.println("Welcome to search for the number occurrence in an array.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Ask which number to find
        System.out.print("Enter the number you want to count: ");
        int searchNum = sc.nextInt();

        // Count occurrences
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == searchNum) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(searchNum + " occurs " + count + " time(s) in the array.");
        } else {
            System.out.println(searchNum + " is not present in the array.");
        }

        sc.close();
    }
}
