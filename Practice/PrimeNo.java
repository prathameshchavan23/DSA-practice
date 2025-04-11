import java.util.*;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        for (int i = 0; i < t; i++) {
            // Input from user
            int n = sc.nextInt();

            if (n <= 1) {
                System.out.println(n + " is not a prime number");
                continue; 
            }

            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break; 
                }
            }

            if (count == 0) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }
        }
        sc.close(); 
    }
}
