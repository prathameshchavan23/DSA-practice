
public class changeString {

    public static String change(String s) {
        char first = s.charAt(0);
        if (Character.isLowerCase(first)) {
            return s.toLowerCase();
        } else {
            return s.toUpperCase();
        }
    }

    public static void main(String[] args) {
        System.out.println(change("Hello"));
        System.out.println(change("hello"));
    }
}
