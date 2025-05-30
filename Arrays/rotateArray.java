
public class rotateArray {

    public static void rotateArraybyDplaces(int[] arr, int d) {
        d = d % arr.length;
        int n = arr.length;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        System.out.println("Array after rotating by 1 place:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        rotateArraybyDplaces(arr, 2);
        System.out.println("\nArray after rotating by D places:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
