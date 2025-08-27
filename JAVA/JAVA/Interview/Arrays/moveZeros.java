public class moveZeros{
    public static void moveZero(int[] nums){
        int left = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZero(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}