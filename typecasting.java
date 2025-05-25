import java.util.ArrayList;

public class typecasting {
    static int myDouble = 9; // for declaring local variable

    public static void main(String[] args) {
        int myDouble = 10;// we can redeclare varible into local scope and it will print it's local value
                          // not global , with global variable declare with static it can be used as local
                          // var
        // System.out.println(myDouble);
        Long num1 = 9749494000L;
        // double ac = (float) num1;
        // System.out.println(ac);
        System.out.println(Long.SIZE); //to check the size of var we have to convert it into wrapper class
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        // System.out.println();

        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } }; // 2D array
        // Multidimensional arrays are useful when you want to store data as a tabular
        // form, like a table with rows and columns.
        char[] mychar = { 'A', 'B', 'C' };
        // System.out.println(mychar);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)

        // System.out.println(cars);
        float a=2;
        float b=3;
        System.out.println(a/b);


    }
}

