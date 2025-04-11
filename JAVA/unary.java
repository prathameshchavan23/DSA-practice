public class unary {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(+a);// It doesn’t change the value
        System.out.println(-a);// It negatives the value of a, but a itself does not change.
        System.out.println(a++);// First, it prints the current value of a, then, it increases a by 1.
        System.out.println(++a);// First, it increases a by 1, then, it prints the new value.
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(!true);// inverts the boolean value.

        // * boolean bl = (5 > 3) ? true : false;
        String st = (5 > 3) ? "I'm small" : "I'm big";
        System.out.println(st);
        boolean bl = (1 > 3) ? ((2 > 3) ? true : false) : ((2 < 3) ? true : false);
        System.out.println(bl);
        System.out.println(~0);// It flips each bit in the binary representation: 0 becomes 1, and 1 becomes 0.
        byte by=50;
        // * byte is a primitive data type in Java that can store values from -128 to 127.
        System.out.println(by);

        double z, b, c;
        z = 3.0 / 0;// infinity
        b = 0 / 4.0;// 0
        c = 0.0 / 0;// NaN (Not a
        System.out.println(c);

    }

}
