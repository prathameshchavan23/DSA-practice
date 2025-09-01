
public class palindromeString {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        //* new word is important so it'll create a new StringBuilder object and we'll reverse it and convert it to string again and checks if it's equal to the original
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("hello")); // false
    }
}
