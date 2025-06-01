import java.util.*;

public class PrintSubsequences
{

    private static void printAllSubsequences(int index, ArrayList<Integer> current, int[] arr)
    {
        if (index >= arr.length) {
            System.out.println(current);
            return;
        }

        // Take Part
        current.add(arr[index]);
        printAllSubsequences(index + 1, current, arr);

        // Not Take part
        current.remove(current.size() - 1); //Remove the last
        printAllSubsequences(index + 1, current, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3};

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("The valid Subsequences are: ");
        printAllSubsequences(0, list, arr);
        sc.close();
    }
}