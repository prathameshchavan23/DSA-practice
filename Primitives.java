import java.sql.SQLOutput;
import java.util.Scanner;
public class Primitives {
    public static void main(String[] args) {
//        int age=64;
//        char letter='r';
//        float marks = 89.46f;
//        double largeDecimalNos = 73399.73839;
//        long LargeInteger = 738992029882L;
//        boolean check = false;

//        int a=234_000_000;//big no.s are not allowed so we can  use this trick
//        System.out.println(a);

        // adding two no.s
        Scanner input = new Scanner(System.in);
//        int num1= input.nextInt();
//        int num2= input.nextInt();
//        int sum = num1+num2;
//        System.out.println("Sum = " + sum);

        //typecasting
//        int num= (int)(67.78f);
//        System.out.println(num);
//
     //java follows unicode / ASCII
//        int a='A';
//        System.out.println(a);

        // to take input as character
        System.out.println("Enter a character");
        char ch= input.next().charAt(0);
        System.out.println("characater is: " +ch);


    }
}

