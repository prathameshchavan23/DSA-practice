
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class primeNo {

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int div = 2; div * div <= n; div++) {
            if (n % div == 0) {
                return false; // found a divisor → not prime
            }
        }
        return true; // no divisors → prime
    }

    // Function to get all primes till N
    public List<Integer> getPrimes(int N) {
        List<Integer> primes = new ArrayList<>();
        for (int num = 2; num <= N; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        primeNo sol = new primeNo();

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        // Test isPrime()
        System.out.println("Is " + N + " prime? " + sol.isPrime(N));
        System.out.println("Prime numbers till " + N + ": " + sol.getPrimes(N));

        sc.close();
    }
}
