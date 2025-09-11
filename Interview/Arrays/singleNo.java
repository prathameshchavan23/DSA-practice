
public class singleNo {

    public static int find(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;// XOR Cancels duplicates
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {4, 1, 2, 1, 2};
        System.out.println(find(nums));
    }
}
