
public class factorial {

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // recursive approach
    public int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
    public static void main(String[] args) {
        factorial f = new factorial();
        System.out.println(f.factorial(5)); // Output: 120
        System.out.println(f.factorialRecursive(5)); // Output: 120
    }
}
