package Challenge_Practics;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = input.nextInt();
        }

        return nums;
    }
}
