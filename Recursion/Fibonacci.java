import java.util.Scanner;

public class Fibonacci {

    public static int fibonaccuNumber(int n)
    {
        if (n <= 1) {
            return n;
        }

        int last = fibonaccuNumber(n - 1);
        int secondLast = fibonaccuNumber(n - 2);

        return last + secondLast;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int result = fibonaccuNumber(n);

        System.out.println("The answer is: " + result);
        sc.close();
    }
}