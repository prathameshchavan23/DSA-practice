public class rotateArray{
    public void rev(int[] nums,int start,int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
            start = start+1;
            end = end-1;
        }
    }

    public void rotateArray(int[] nums, int k){
        int n = nums.length;
        if(k%n==0){
            return;
        }
        k=k%n;
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
    public static void main(String[] args) {
        rotateArray obj = new rotateArray();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        obj.rotateArray(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}