public class largest_element {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 7, 7 };
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println("Largest element "+ largest);
        int secondl = Integer.MIN_VALUE;
        for (int i = 0; i < a.length ; i++) {
            if (a[i] != largest && a[i] > secondl) {
                secondl = a[i];
            }
        }
        System.out.println("Second largest: "+secondl);

    
    }

}