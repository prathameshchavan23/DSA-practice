
public class secondLargest {

    public static int secondLarge(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;;

        for (int num : nums) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num < largest) {
                second = num;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int nums[] = {10, 20, 77, 15, 67, 7};
        System.out.println("Second largest element: " + secondLarge(nums));
    }
}
