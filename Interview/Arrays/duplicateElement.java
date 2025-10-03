
import java.util.Arrays;

public class duplicateElement {

    // Remove duplicate elements from unsorted array
    public static int[] removeFromUnsortedArray(int[] nums) {
        return Arrays.stream(nums).distinct().toArray();
    }

    public static int removeFromSortedArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int nums[] = {4, 1, 2, 1, 2};
        System.out.println(Arrays.toString(removeFromUnsortedArray(nums)));
        int newLength = removeFromSortedArray(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Array after removal: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
