package Recursion;
import java.util.*;

public class CheckPalindrome {
    
    private static boolean isPalindrome(int i, String s) {
        int n = s.length();
        if (i >= n/2) {
            return true;
        } 
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
        return isPalindrome(i + 1, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();

        boolean result = isPalindrome(0, s);
        System.out.println(result);
        sc.close();
    }
}
