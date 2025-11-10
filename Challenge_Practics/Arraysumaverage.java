package Challenge_Practics;

public class Arraysumaverage {
    public static void main(String[] args) {
        System.out.println("Here you get the average and sum of all elements in an array:\n");

        int[] numArray = ArrayUtility.inputArray();

        long sum = sum(numArray);
        int avg = average(numArray);

        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Average of the numbers is: " + avg);
    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while(i < numArray.length) { // ✅ fixed condition
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] numArray) {
        long sum = sum(numArray);
        return (int)(sum / numArray.length);
    }
}
