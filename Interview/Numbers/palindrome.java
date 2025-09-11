
public class palindrome {

    public boolean getPalindrome(int x) {
        int temp = x;
        if (x < 0) {
            return false;
        }
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        return (rev == temp);
    }

    public static void main(String[] args) {
        palindrome p = new palindrome();
        System.out.println(p.getPalindrome(121)); // true
        System.out.println(p.getPalindrome(-121)); // false
        System.out.println(p.getPalindrome(10)); // false
    }
}
