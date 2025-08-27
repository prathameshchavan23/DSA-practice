
import java.util.Scanner;

public class switchstatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String fruit = sc.next();

        // switch (fruit) {
        // case "Mango":
        // System.out.println("King of fruits");
        // break;
        // case "Apple":
        // System.out.println("Red fruit");
        // break;
        // case "Orange":
        // System.out.println("Round fruit");
        // break;
        // default:
        // System.out.println("Non-valid fruit Entered");
        // break;
        // }

        // enhanced switch style:
        // switch (fruit) {
        // case "Mango" -> System.out.println("King of fruits");
        // case "Apple" -> System.out.println("Red fruit");
        // case "Orange" -> System.out.println("Round fruit");
        // default -> System.out.println("Non-valid fruit enetered");
        // }

        // Nested switch
        int empId = sc.nextInt();
        String department = sc.next();
        switch (empId) {
            case 1:
                System.out.println("Prathamesh chavan");
                break;
            case 2:
                System.out.println("Rahul");
                break;
            case 3:
                System.out.println("Emp no 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "HR":
                        System.out.println("HR department");
                        break;
                    default:
                        System.out.println("Invalid department");
                }
                break;
            default:
                System.out.println("Invalid employee id");

        }

    }
}
