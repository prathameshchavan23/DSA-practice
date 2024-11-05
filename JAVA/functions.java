import java.util.Scanner;

public class functions {
    // Functions is used when we don't want to use the code repeatedly
    // syntax:
    // return_type name(){
    // //body
    // return statement;
    // }
    public static void main(String[] args) {
        int ans = sum();
    }

    static int sum() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter first no: ");
        num1 = sc.nextInt();
        System.out.println("Enter second no: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        return sum; // means it's returning value back to function and it ends here , function is
                    // over
        // System.out.println("The sum is: " + sum);
    }
}
