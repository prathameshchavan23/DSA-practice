import java.util.Arrays;

public class largestElement {
    // O(n log n)
    public static int findLargest(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }

    // O(n)
    public static int findlarge(int[] nums) { 
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 2, 8};
        System.out.println("Largest element: " + findlarge(arr));
    }
}
