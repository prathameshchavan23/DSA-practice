package Loops;

public class recurringdigitcount {
    public static void main(String[] args) {
        // int n=4555336;
        // int count =0;//to count the given no.s
        // while(n>0){
        // int rem=n%10;//to take last digit as remainder
        // if(rem ==5){
        // count++;
        // }
        // n=n/10;
        // }
        // System.out.println(count);

        // Although i was originally initialized to 100, the loop re-initializes i to 1
        // and runs it through the iterations until i reaches 5. The loop stops once i
        // is no longer less than 5 (i.e., when i == 5).
        // Therefore, when the System.out.println(i); statement is executed, it prints
        // 5, the final value of i after the loop terminates.
        int i = 100;
        for (i = 1; i < 5; i++) {
        }
        System.out.println(i);
        // The initial value 100 is overwritten by i = 1 in the loop.
        // The loop increments i up to 5, then exits.

    }
}
