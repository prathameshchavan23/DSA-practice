public class reverseNo{
        public int reverse(int number) {
        long rev = 0;  // use long to handle overflow during calculation
        
        while (number != 0) {
            int digit = number % 10;    // extract last digit
            rev = rev * 10 + digit; // append digit to reversed number
            number = number / 10;            // remove last digit
        }
        
        // if reversed number overflows int range, return 0
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) rev; // convert back to int
    }
    public static void main(String[] args) {
        reverseNo rev = new reverseNo();
        System.out.println("Reversed: " + rev.reverse(12345));
    }
}