import java.util.*;

public class two_d_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

        // * Take input from user
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                // * arr[row].length gives the number of columns in the current row.
                arr[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
        System.out.print(arr[row][col] + " ");
        }
        System.out.println();
        }

        //? Enhanced version of for loop
        for (int row = 0; row < arr.length; row++) {
        System.out.println(Arrays.toString(arr[row]));
        }

        //? For-each loop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        // * for (int[] a : arr) iterates over each row of the 2D array.
        // * Arrays.toString(a) prints that row as a formatted string.

    }
}
