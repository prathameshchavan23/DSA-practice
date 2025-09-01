
public class pangram {

    public static boolean isPangram(String s) {
        s = s.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog")); // true
        System.out.println(isPangram("Hello World")); // false
    }
}
