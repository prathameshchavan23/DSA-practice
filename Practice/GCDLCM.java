import java.util.Scanner;

public class GCDLCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int o1 = n1; // as n1 and n2 will change and we have to use it to calculate lcm
        int o2 = n2;

        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd = n2;// jo akri division krta hai it's greatest divisor
        int lcm = (o1 * o2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }
}
