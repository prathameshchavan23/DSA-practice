
public class fibonacciNo {

    //Find the n'th Fibonacci number
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public int fibonacci2(int n) {
        if (n <= 1) {
            return n;  // base case
        }
        return fibonacci2(n - 1) + fibonacci2(n - 2);
    }

    //Print Fibonacci up to N terms
    public int[] fibonacciUpToN(int n) {
        int[] result = new int[n];
        if (n == 0) {
            return result;
        }
        if (n >= 1) {
            result[0] = 0;
        }
        if (n >= 2) {
            result[1] = 1;
        }
        // * don't do i <= n
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

    public static void main(String[] args) {
        fibonacciNo fib = new fibonacciNo();
        System.out.println("Fibonacci : " + fib.fibonacci(10));
        int[] arr = fib.fibonacciUpToN(7);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
