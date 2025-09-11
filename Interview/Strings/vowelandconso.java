
public class vowelandconso {

    public static String countVowelConsonant(String str) {
        str = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (char ch : str.toCharArray()) {
            // check condition properly
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return "Vowels: " + vowels + ", Consonants: " + consonants;
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println(countVowelConsonant(input));
    }
}
