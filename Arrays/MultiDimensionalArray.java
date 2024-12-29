package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public void takeInput(int arr[][]) 
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
    }

    public void displayArray(int arr[][])
    {
        for(int[] element : arr) {
            System.out.println(Arrays.toString(element));;
        }
    }

    public static void main(String[] args) {
        MultiDimensionalArray obj = new MultiDimensionalArray();
        int[][] array = new int[3][3];
        obj.takeInput(array);
        obj.displayArray(array);
    }
}