
import java.util.HashMap;
import java.util.Map;

public class mostFrequentChar {

    public static char mostFrequentChar(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();

        // Count frequency
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Find max frequency
        char mostFrequent = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        String input = "Prathamesh";
        char result = mostFrequentChar(input);
        System.out.println("Most Frequent Character: " + result);
    }

}
