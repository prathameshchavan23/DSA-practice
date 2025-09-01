
import java.util.ArrayList;
import java.util.List;

public class SubString {

    public static String getSubString(String str, int start, int end) {
        if (start < 0 || end > str.length() || start > end) {
            throw new IllegalArgumentException("Invalid start or end indices");
        }
        StringBuilder result = new StringBuilder();

        // Copy characters from start to end-1
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static List<String> getAllSubstrings(String s) {
        List<String> result = new ArrayList<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                result.add(s.substring(i, j));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "Hello World";
        String output = SubString.getSubString(input, 0, 5);
        System.out.println("SubString: " + output);
    }
}
