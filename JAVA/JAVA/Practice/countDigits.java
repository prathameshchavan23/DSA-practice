import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int num = n;

        System.out.println("Digits from last to first:");
        while(num!=0) {
            int lastDigit = num % 10;
            num = num / 10; // reduces number
            System.out.println(lastDigit); // prints one digit
        }

        sc.close();
    }
}
