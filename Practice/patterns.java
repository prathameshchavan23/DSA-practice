import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {

        // for(int row=1;row<=5;row++){
        // for(int col=1;col<=5;col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // int n=5;
        // int spaces = n-1;
        // for(int row=1;row<=n;row++){
        // // spaces
        // for(int space=1;space<=spaces;space++){
        // System.out.print(" ");
        // }
        // System.out.println();
        // for(int col=1;col<=row;col++){
        // System.out.print("* ");
        // }
        // }

        // int r;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        // int count=0;
        // while(n>0){
        // // r= n%10;
        // n=n/10;
        // count++;
        // }
        // System.out.println(count);

        int sum = 0;
        int r = 0;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            System.out.print(r);
        }
        if(r==m){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
            }    }

}