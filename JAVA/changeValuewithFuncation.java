public class changeValuewithFuncation {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        changeValue(arr);//call by value
        System.out.println(arr[0]);
        System.out.println(arr[1]);

    }

    static void changeValue(int[] nums ) {
        nums[0] = 90;
         // It will changed as we are modifying array
    }
}
