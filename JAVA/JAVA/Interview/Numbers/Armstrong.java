
public class Armstrong {

    public static boolean isArmstrong(int number) {
        int temp = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
            if (sum > temp) {
                return false; // early exit

            }}
        return sum == temp;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(123));
    }
}
