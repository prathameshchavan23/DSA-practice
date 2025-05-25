public class selectionSort {

    public static int getMinIndex(int[] arr, int start) {
        //start should be after sorted region before 3 which is passed as start is sorted region
        int minIndex = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = getMinIndex(arr, i);
            if (i != minIndex) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 9, 6, 8, 5, 4, 9};
        System.out.println(getMinIndex(arr, 0));
        selectionsort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
