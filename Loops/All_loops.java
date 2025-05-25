package Loops;

public class All_loops {
    public static void main(String[] args) {
        // int i = 1, count = 1; // count is used to know the count
        // while (i < 100) { //entry loop
        // System.out.println((++count)+ " - Hello"); // Infinity times if we hadn't put
        // i++
        // i+=2;
        // }

        // do { //it runs for at-least one time
        // System.out.println(i);
        // ++i;
        // } while (i < 2); // exit loop

        // int i;
        // for (i = 100; i >= 1; i--) { // first i=100 condition get's print then other
        // conditions get checked one by
        // // one
        // System.out.println(i);
        // }

        // For-each loop
        // int i;
        // for (i = 6; i >= 1; i--) {
        //     int arr[] = { 1, 2, 3, 4 };
        //     for (int val : arr)
        //         System.out.print(val);
        //     System.out.println();
        // }


        //Labelled Loop:
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue outerLoop; // Skips to the next iteration of the outer loop
                }
                if (i == 3) {
                    break outerLoop; // Breaks the outer loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
    
    

}
