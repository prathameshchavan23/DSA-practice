// Import necessary package
import java.util.*;

public class Main { // Renamed the class to avoid conflict
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        // * Integer is a wrapper class also is an example of Generics in Java.
        Scanner in = new Scanner(System.in);
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // System.out.println(list);

        // list.set(0,5); // to change at 0th index
        // list.remove(2);
        // System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // * To pass index here ,list[index] doesn't work here */
        }
        System.out.println(list);
    }
}
