
import java.util.Arrays;

public class missingNo {

    public static int missNo(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int actSum = Arrays.stream(nums).sum();
        return sum - actSum;
    }

    public static int missNo2(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            ans = ans ^ i;
        }
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 5};
        System.out.println("Missing number is: " + missNo(nums));
        System.out.println("Missing number is: " + missNo2(nums));
    }
}
