public class unary {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(+a);
        System.out.println(-a);
        System.out.println(a++);// assign value then increase
        System.out.println(++a);// increase value then assign
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(!true);

        // boolean bl = (5 > 3) ? true : false;
        String st = (5 > 3) ? "I'm small" : "I'm big";
        boolean bl = (1 > 3) ? ((2 > 3) ? true : false) : ((2 < 3) ? true : false);
        System.out.println(bl);
        System.out.println(~0);// It flips each bit in the binary representation: 0 becomes 1, and 1 becomes 0.
        // byte by=50;
        // System.out.println(by);
       
         double z,b,c;
         z=3.0/0;//infinity
         b=0/4.0;//0
         c=0.0/0;//NaN (Not a 

    }

}
