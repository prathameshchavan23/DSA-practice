import java.util.Scanner;

public class functions {
    // Functions is used when we don't want to use the code repeatedly
    // syntax:
    // return_type function_name(){
    // return statement;
    // }
    public static void main(String[] args) {
        // int ans = sum();
        // System.out.println("The addition of both no.s is " + ans);

        // To pass with values rather than scan-f
        int ans2 = sum3(11, 12);
        System.out.println("The addition of 11 and 12 is " + ans2);

        // Returning a string
        String greet = myGreet("Prathamesh");
        System.out.println(greet);
    }

    static int sum() { // anything used in static it has to be static
        // you need to return int only no string or else
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter first no: ");
        num1 = sc.nextInt();
        System.out.println("Enter second no: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        return sum; // means it's returning value back to function and it ends here , function is
                    // over
        // for without return replace int with Void
        // System.out.println("The sum is: " + sum); // unreachable code after return no
        // code can't be written
    }

    static int sum3(int a, int b) {
        int ans = a + b;
        return ans;
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
}
