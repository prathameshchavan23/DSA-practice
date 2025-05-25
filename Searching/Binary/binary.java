public class binary {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 8, 10};
        int target = 8;
        boolean ans = binarySearch(arr, target);
        System.out.println(binarySearch(arr, target));
    }

    public static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

}
