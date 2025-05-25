import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        int temp = arr[0]; // store the first element

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;

//        System.out.println(Arrays.toString(arr));
        for (int val : arr) {
            System.out.print(val + " ");
        }

    }
}
