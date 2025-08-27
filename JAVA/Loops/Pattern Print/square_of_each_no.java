// 1 4 9 16 25 
// 1 4 9 16 25 
// 1 4 9 16 25 
// 1 4 9 16 25 
// 1 4 9 16 25

public class square_of_each_no {
    public static void main(String[] args) {

        int row, col;
        for (row = 1; row <= 5; row = row + 1) { // Outer loop to control rows (1 to 5)

            for (col = 1; col <= 5; col = col + 1) { // Inner loop to control columns (1 to 5)
                System.out.print(col * col * col + " "); // Print square of column number
            }
            
            System.out.println(); // Move to the next line after completing each row
        }

    }
}

// In the inner loop, col represents the current column number
// (from 1 to 5), and col * col calculates the square of that 
// column number. You are printing the square of the column 
//number for each column in every row. This way, the numbers 
//printed are based on the column position, and you see the same squared values across all rows.


