package Loops;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int empNo= in.nextInt();
        String depart = in.next();

        switch(empNo){
            case 1:
                System.out.println("Hi");
                break;
            case 2:
                System.out.println("3rd");//this is imp
                switch (depart){
                case "IT":
                    System.out.println("IT department");
                    break;
                    case "CS":
                        System.out.println("CS department");
                        break;
            }
            default:
                System.out.println("Input is wrong");
        }
    }
}
