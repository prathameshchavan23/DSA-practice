public class methods_1 {
    public static void main(String[] args) {
        System.out.println("Hey@@");

        // * 1) Non-return type
        // * Possible ways to call a method
        println();// 1st: if you write this before println psvm will print after
        // method then
        methods_1.println();// 2nd: Class-name.methodname()
        methods_1 obj = new methods_1();
        obj.println();// 3rd: creating object

        // * 2) Return Type:
        int i = getReturnType();
        System.out.println(getReturnType());

        // * 3) Return Type with parameter:
        System.out.println(sum(12, 12, 12));

        // * 4) Non-return type With parameter
        addition(1, 2);

        // 5) Recursion
        Recursion(5);

    }

    // * Methods in java:

    // * 1) Non-return type
    static void println() { // method is a
        System.out.println("Hello, World!");
    }

    // * 2) Return Type: we have to provide value here
    static int getReturnType() {
        return 12;
    }

    // * 3) Return Type with parameter:
    static Integer sum(int num1, int num2) {
        return num1 + num2;
    }

    // * 4) Non-return type With parameter
    // static void addition(int num1, int num2) {
    //     System.out.println(num1 + num2);
    // }

    // * 5) Method Overloading:
    // static void addition(int num1, int num2) {
    //     System.out.println(num1 + num2);
    // }

    static Integer sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // * 6) Recursion
    static void Recursion(int num) {
        System.out.println(num);
        // it will print 5 first because above line will pass 5 first which we have
        // called above at main function
        if (num > 0)
            Recursion(num - 1);
        System.out.println(num);

    }

}
