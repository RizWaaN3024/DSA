import java.util.*;

public class StockSpanBrute {
    static List<Integer> list = new ArrayList<>();

    StockSpanBrute() {
        list = new ArrayList<>();
    }

    private static int findStockSpan(int value) 
    {
        list.add(value);
        int count = 1;
        for (int i = list.size() - 2; i >= 0; i--) {
            if (list.get(i) <= value) {
                count++;
            } else {
                break;
            }
        } 
        return count;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = findStockSpan(arr[i]);
            System.out.print(result + " ");
        }
    }
}
