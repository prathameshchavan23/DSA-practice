import java.util.Scanner;

public class inverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int position = 1; // Position starts from 1 (not 0)
        int inverse = 0;

        while (n != 0) {
            int digit = n % 10; // Extract last digit
            // Place the current position at the index = digit
            inverse += position * (int) Math.pow(10, digit - 1);
            position++;
            n /= 10; // Remove last digit
        }

        System.out.println("Inverse of number is: " + inverse);
        sc.close();
    }
}
