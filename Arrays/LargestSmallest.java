package Arrays;

import java.util.Scanner;

public class LargestSmallest {

    public int findLargestNumber(int array[]) 
    {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findSmallestNumber(int array[])
    {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        LargestSmallest obj = new LargestSmallest();
        int largestNumber = obj.findLargestNumber(array);
        int smallestNumber = obj.findSmallestNumber(array);

        System.out.println("The largest number is:" + largestNumber);
        System.out.println("The smallest number is:" + smallestNumber);
    }
}
