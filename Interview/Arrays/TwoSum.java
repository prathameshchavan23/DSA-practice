
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] getTwosum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if (map.containsKey(diff)) {
                //* Check Syntax properly
                return new int[]{map.get(diff), i};
            }
            map.put(numbers[i], i);

        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.getTwosum(numbers, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
