
public class insertPosition {

    public static int searchPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // * It should be inside loop 

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 7};
        int target = 5;
        int position = searchPosition(nums, target);
        System.out.println("Position: " + position);
    }
}
