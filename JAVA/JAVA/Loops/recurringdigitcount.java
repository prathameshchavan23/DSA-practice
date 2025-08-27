
public class recurringdigitcount {
    public static void main(String[] args) {
        int n = 4555336;
        int count = 0;// to count the given no.s
        while (n > 0) {
            int rem = n % 10;// to take last digit as remainder
            n = n / 10; // To remove the last digit we use /10
            if (rem == 5) {
                count++;
                //*  The digit 5 appears 3 times in 4555336, so the program prints 3.
            }
        }
        System.out.println(count);

    }
}
