
public class ManualSortString {

    public static String[] sortStrings(String[] arr) {
        // Bubble sort / selection sort style
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) { // compares two strings alphabetically (lexicographically)
                    // swap
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] > chars[j]) {   // swap
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        //* for string array
        String[] input = {"prathamesh", "rahul", "jayraj", "sahu"};
        String[] result = sortStrings(input);

        //* for single string
        String input2 = "zebra";
        String result2 = sortString(input2);
        System.out.println("Sorted: " + result2);

        System.out.println("Sorted Strings:");
        for (String str : result) {
            System.out.println(str);
        }
    }
}
