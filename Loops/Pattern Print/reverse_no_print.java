
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1

public class reverse_no_print {
    public static void main(String[] args) {

        int row, col;
        for (row = 1; row <= 5; row=row+1) { //outer loop controls rows
            for (col = 5; col >= 1; col = col -1) { // inner loop controlling column
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
