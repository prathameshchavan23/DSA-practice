package Loops;

import java.util.Scanner;

public class switchstatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        int marks = 90;
        int mnum = 99;
        // we can use if-else or if-else ladder inside this
        switch (marks) {
            case 90:
                switch (mnum) {
                    case 2:
                        System.out.println("9");
                }
                break;
        }

        
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            default:
                System.out.println("Non-valid fruit enetered");
                break;
        }
        // enhanced switch style:
        // switch (fruit) {
        // case "Mango" -> System.out.println("King of fruits");
        // case "Apple" -> System.out.println("Red fruit");
        // case "Orange" -> System.out.println("Round fruit");
        // default -> System.out.println("Non-valid fruit enetered");
        // }

    }
}
