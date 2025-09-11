
public class firstUniqueChar {

    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        s = s.toLowerCase(); // convert everything to lowercase

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String input = "prathamesh";
        int result = firstUniqChar(input);
        System.out.println("First Unique Character Index: " + result);
    }
}
