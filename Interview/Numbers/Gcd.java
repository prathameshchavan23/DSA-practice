
public class Gcd {

    public int gcdnormal(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Using recursion
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }


    public static void main(String[] args) {
        Gcd gcdCalculator = new Gcd();
        System.out.println("GCD (Normal): " + gcdCalculator.gcdnormal(48, 18));
        System.out.println("GCD (Recursive): " + gcdCalculator.gcd(48, 18));
        System.out.println("LCM: " + gcdCalculator.lcm(48, 18));
    }
}
