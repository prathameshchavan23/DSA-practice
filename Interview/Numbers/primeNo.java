
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class primeNo {

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        if (n <= 3) {
            return true; // 2 and 3 are prime
        }
        for (int i = 2; i * i <= n; i++) { // check till sqrt(n)
            if (n % i == 0) {
                return false;
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
