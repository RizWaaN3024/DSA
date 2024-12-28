package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BasicArray {

    int testArray[] = new int[5];

    public void reverseArray(int array[]) 
    {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        BasicArray obj = new BasicArray();
        obj.reverseArray(arr);
    
        // for (int num : arr) { // for every element in array print the element
        //     System.out.println(num); //num represents element of the array
        // }

        // System.out.println(Arrays.toString(arr));
    }
    
}
