
import java.util.Scanner;
public class pattern_print {
    public static void main(String[] args) {

        int row, col;
        for (row = 1; row <= 4; row = row + 1) {

            for (col = 1; col <= 5; col = col + 1) {
                System.out.print("10" + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

    }
}
