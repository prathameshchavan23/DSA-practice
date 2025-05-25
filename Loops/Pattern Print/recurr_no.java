// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25

public class recurr_no {
    public static void main(String[] args) {
        int number = 1;  // Start from 1
        for (int row = 1; row <= 5; row++) {  // Outer loop for 5 rows
            for (int col = 1; col <= 5; col++) {  // Inner loop for 5 columns
                System.out.print(number + " ");  // Print the current number
                number++;  // Increment the number
            }
            System.out.println();  // Move to the next line after each row
        }
    }

}
