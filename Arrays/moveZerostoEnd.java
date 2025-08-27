
class moveZerostoEnd {

    public static void moveZeroes(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                j = i;
                break;
            }
        }
      
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap the elements
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
