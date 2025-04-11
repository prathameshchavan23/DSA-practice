import java.util.Scanner;

public class alphabet_case_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        // trim removes extra spaces between given input and in.next takes as input
        // charAt(0) returns the first character of the string.
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lower case");
        } else {
            System.out.println("upper case");
        }
    }

}
