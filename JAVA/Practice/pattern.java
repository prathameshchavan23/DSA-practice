import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int i = n; i >= 1; i--) { // * reverse loop
        // for (int col = 1; col <= i; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        int space = 0;
        int star = n ;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* \t");
            }
            space++;
            star--;
            System.out.println();
        }

    }
}
