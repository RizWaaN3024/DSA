import java.util.*;

public class PrintSubsequences {
    
    private static void printAllSubsequences(int index, ArrayList<Integer> current, int[] arr) {
        if (index >= arr.length) {
            System.out.println(current);
            return;
        }

        // Take: Include Current Element
        current.add(arr[index]);
        printAllSubsequences(index + 1, current, arr);

        // Not Take: Exclude Current Element Backtrack first
        current.remove(current.size() - 1); //Remove last added element
        printAllSubsequences(index + 1, current, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {3, 1, 2};
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("All Subsequences: ");
        printAllSubsequences(0, list, arr);
        sc.close();
    }
}
