import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Handling edge cases
        if (n == 1) {
            System.out.println(0);
            return;
        } else if (n == 2) {
            System.out.println(1);
            return;
        }

        int a = 0;
        int b = 1;
        int count = 2;

        while (count < n) { // Fix: Changed from count <= n to count < n
            int temp = b;
            b = b + a;
            a = temp;
            count++; // Increments count to track how many Fibonacci numbers have been computed
        }

        System.out.println(b);
        sc.close(); // Closing scanner to prevent memory leak
    }
}
