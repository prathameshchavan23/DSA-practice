public class factorial {
    public static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        // int assumption = fact(n - 1);
        // return n * assumption;
        return n + fact(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fact(3));
    }
}