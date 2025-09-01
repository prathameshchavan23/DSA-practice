
public class reverseString {

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static String reverse2(String str) {
        char[] arr = str.toCharArray();
        int i=0;
        int j = arr.length-1;
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String output = reverse(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + output);
        String output2 = reverse2(input);
        System.out.println("Reversed2: " + output2);
    }
}
