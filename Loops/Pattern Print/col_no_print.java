
public class col_no_print {
    public static void main(String[] args) {
        int row, col;
        for (row = 1; row <= 5; row = row - 1) {

            for (col = 1; col <= 5; col = col + 1) {
                System.out.print(col + " "); // row is used so the no.of row is printed 5 times as per loop
            }
            System.out.println(); // Move to the next line after each row
        }

    }
}
