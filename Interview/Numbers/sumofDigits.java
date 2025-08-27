
public class sumofDigits {

    public int sum(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        sumofDigits sod = new sumofDigits();
        System.out.println(sod.sum(123));  // Output: 6
        System.out.println(sod.sum(-456)); // Output: 15
    }
}
