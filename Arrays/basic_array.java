import java.util.*;

public class basic_array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // * All are valid declarations -
        // ? Declaration of different types of arrays in Java

        // ? Integer array
        int[] intArray = { 10, 20, 30 };
        int[][] intArray2d = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(intArray[0]);
        // System.out.println(intArray2d);
        // * intArray2d is a reference to an array object, and Java does not override
        // toString() for arrays.
        // * So, it prints the memory address (hashcode) instead of the actual elements.

        for (int e : intArray) {
            System.out.println(e + " ");
        }

        for (int i = 0; i <= intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        int[] arr;// declaration of array
        arr = new int[5];// object is being created in heap here

        // System.out.println(arr[1]);
        // String[] arr1 = new String[4];
        // System.out.println(arr1[1]);

        // * Input for every element
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = in.nextInt();
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i] + " ");
        // }

        // * For-each loop
        // for (int num : arr) { // * For every element of array, print the element */
        // System.out.println(num + " ");// here num represents element of array
        // }
        // System.out.println(Arrays.toString(arr)); // * Convert array to string

        int[] nums = { 3, 4, 5, 12 };
        // System.out.println(Arrays.toString(nums)); // Output: [3, 4, 5, 12]
        // change(nums);
        // System.out.println(Arrays.toString(nums)); // Output: [99, 4, 5, 12]
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
