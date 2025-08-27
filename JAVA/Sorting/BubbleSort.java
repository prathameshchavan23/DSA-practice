public class BubbleSort {
    // Ascending oder
    public static void bubblesortAsc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            // Optimization: break early if no swaps in this pass
            if (!isSwapped) return;
        }
    }

    // Descending oder
    public static void bubblesortDesc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] <= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            // Optimization: break early if no swaps in this pass
            if (!isSwapped) return;
        }
    }


    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 9, 6, 8, 5, 4, 9};
        bubblesortAsc(arr);
        System.out.println("Ascending Order :");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        bubblesortDesc(arr);
        System.out.println("Descending Order :");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
