
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class intersection {

    public static void main(String[] args) {
        int[] one = {10, 12, 14, 20, 40};
        int[] two = {10, 11, 17, 20, 40};
        // common elements in two sorted arrays
        System.out.println(Arrays.toString(interSection(one, two)));
    }

    public static ArrayList<Integer> intersection(int[] one, int[] two) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < one.length && j < two.length) {
            if (one[i] < two[j]) {
                i++;
            } else if (one[i] > two[j]) {
                j++;
            } else {
                ans.add(one[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    // * Leetcode 349: Intersection of Two Arrays
    public static int[] interSection(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> n2 = new HashSet<>();
        for (int num : nums1) {
            n1.add(num);
        }
        for (int num : nums2) {
            n2.add(num);
        }
        int[] res = new int[n1.size()];
        int k = 0;
        for (int num : n1) {
            if (n2.contains(num)) {
                res[k] = num;
                k = k + 1;
            }
        }
        return Arrays.copyOfRange(res, 0, k);
    }
}
