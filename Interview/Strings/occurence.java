
import java.util.HashMap;
import java.util.Map;

public class occurence {

    public static Map<Character, Integer> countCharacterOccurrences(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : s.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        return charCount;
    }

    public static int[] countCharactersArray(String s) {
        int[] count = new int[128]; // Assuming ASCII
        for (char ch : s.toCharArray()) {
            count[ch]++;
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "Hello World";
        Map<Character, Integer> result = countCharacterOccurrences(input);
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        int[] arrayResult = countCharactersArray(input);
        for (int i = 0; i < arrayResult.length; i++) {
            if (arrayResult[i] > 0) {
                System.out.println("Character: " + (char) i + ", Count: " + arrayResult[i]);
            }
        }
    }
}
