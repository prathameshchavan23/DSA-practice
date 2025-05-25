import java.lang.reflect.Array;
import java.util.ArrayList;

public class intersection {
    public static void main(String[] args) {
        int[] one = {10, 12,14,20,40};
        int[] two = {10, 11,17,20,40};
        System.out.println(intersection(one, two));
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
}
