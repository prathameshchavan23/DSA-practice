
import java.util.HashSet;
import java.util.Set;

public class vowelandconso {

    public static int[] countVowelsAndConsonants(String s) {
        int vowels = 0;
        int consonants = 0;
        Set<Character> vowelset = new HashSet<>();
        vowelset.add('a');
        vowelset.add('e');
        vowelset.add('i');
        vowelset.add('o');
        vowelset.add('u');
        for (char ch : s.toCharArray()) {
            char lower = Character.toLowerCase(ch);
            // * Character.isLetter(c) ensures we skip digits, spaces, and symbols.
            if (Character.isLetter(ch)) {
                if (vowelset.contains(lower)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        String input = "Hello World";
        int[] result = countVowelsAndConsonants(input);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
