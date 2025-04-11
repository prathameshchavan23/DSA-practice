import java.util.Scanner;

class Algebra {
    int add(int a, int b) {
        int ans = a + b;
        return ans;
    }

}

public class methods {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("Sum of input no.s is: ");
        int ans = obj.add(x, y);
        System.out.println(ans);

    }
}
