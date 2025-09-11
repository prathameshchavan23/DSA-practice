
class maxSubArray {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize with first element
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray or start new
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        maxSubArray obj = new maxSubArray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + obj.maxSubArray(nums));
    }
}
