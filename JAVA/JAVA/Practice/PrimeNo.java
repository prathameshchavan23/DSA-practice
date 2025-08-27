
public class PrimeNo {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0, 1, negatives are not prime

        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // divisible

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 29;
        System.out.println(n + " is prime? " + isPrime(n));

    }
}
