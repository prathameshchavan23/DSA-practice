import java.util.Scanner;

public class fact {

    public static int fact(int x) {
        int value = 1;
        for (int i = 1; i <= x; i++) {
            value = value * i;
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dig = n;
        int r = sc.nextInt();
        int npr = fact(n);
        int npmr = fact(n - r);
        int npmrr = npr / npmr;

        System.out.println(n + r + npmrr);

       
        
    }

}
