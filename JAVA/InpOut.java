import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InpOut {
    public static void main(String[] args) {
        // Input Using command Line argument: javac(for compile) and java(for input)
        // System.out.println(args[0]);// Index 0 out of bounds for length 0, array jab
        // create nhi hota hai

        // Input using Scanner class
        Scanner sc = new Scanner(System.in);
        // scanner is class and sc is a object, new helps to create object means memory
        // int a;
        // a = sc.nextInt();
        // System.out.println(a);

        String ste = sc.nextLine();
        System.out.println(ste);

        char ch = sc.next().charAt(0);
        System.out.println(ch);

        // Methods

        // Int - nextInt()

        // float - nextFloat()

        // double - nextDouble()

        // byte - nextByte()

        // short - nextShort()

        // long - nextLong()

        // boolean - nextBoolean()

        // String - nextLine()

        // Character - next().charAt(position)

        // BigInteger - nextBigInteger()

        // BigDecimal - nextBigDecimal()

//        BufferedReader Vs Scanner

// .BufferedReader is a very basic way to read the input generally used to read
// the stream of characters.

// .Buffer Reader is faster over scanner and can take more larger size input
// because Scanner does lots of post-processing for parsing the input; as seen
// in nextint(), nextFloat()

// .BufferedReader is is synchronized. It uses while dealing with multiple
// threads.

// .The Scanner is used - For decent input, and easy readab



// System.out.printf("%d",1);//printf means f means format specifier 
System.out.printf("%s","Hello world");
System.out.printf("Hello %s","World");


// System.out.println(new Date());
//Formatted Date
SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
String str = sdf.format(new Date()); //format tpe format
// System.out.println("Formatted Date :"+ str);
}
}
