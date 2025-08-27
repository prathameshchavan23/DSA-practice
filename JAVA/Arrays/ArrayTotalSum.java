public class ArrayTotalSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int totalSum = 0;

        for (int val : a) totalSum += val;
        for (int val : b) totalSum += val;

        System.out.println("Total sum of both arrays: " + totalSum);
    }
}
