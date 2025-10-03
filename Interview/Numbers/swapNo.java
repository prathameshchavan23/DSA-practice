
public class swapNo {

    public static void swapUsingArithmetic(int a, int b) {
        System.out.println("Method 1: Addition/Subtraction");
        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b;  // a now contains sum of both numbers
        b = a - b;  // b = (a + b) - b = original a
        a = a - b;  // a = (a + b) - original a = original b

        System.out.println("After swap: a = " + a + ", b = " + b);
        System.out.println();
    }
    public static void swapUsingBitwise(int a, int b) {
        System.out.println("Method 2: Bitwise XOR");
        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a ^ b;  // a now contains XOR of both numbers
        b = a ^ b;  // b = (a ^ b) ^ b = original a
        a = a ^ b;  // a = (a ^ b) ^ original a = original b

        System.out.println("After swap: a = " + a + ", b = " + b);
        System.out.println();
    }
    public static void main(String[] args) {
        int a = 5, b = 10;

        swapUsingArithmetic(a, b);
        swapUsingBitwise(a, b);
    }
}
