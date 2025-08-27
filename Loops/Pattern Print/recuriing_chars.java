// a a a a a
// b b b b b 
// c c c c c 
// d d d d d 
// e e e e e 

public class recuriing_chars {
    public static void main(String[] args) {
        int row, col;
        for (row = 1; row <= 5; row++) {
            // "a" + (row - 1) => a converted to ASCII becomes 97 => ( 97 + (2(row) -1) => 98 => "b" 
            char name = (char) ('a' + (row - 1)); // Correct character manipulation
            for (col = 1; col <= 5; col++) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}
