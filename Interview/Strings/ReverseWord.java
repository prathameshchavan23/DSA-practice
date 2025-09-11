
public class ReverseWord {

    public static String reverseWords(String s) {
        String[] str = s.split("\\s+");
        //s.split("\\s+") splits the string into an array of words.
        //Example: " hello world " → ["hello", "world"]
        StringBuilder stringBuild = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            stringBuild.append(str[i]);
            if (i != 0) {
                stringBuild.append(" ");
            }
        }

        return stringBuild.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        String output = ReverseWord.reverseWords(input);
        System.out.println("Reversed Words: " + output);
    }
}
