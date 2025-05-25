
public class Pattern {
    public static void main(String[] args) {
        int size = 5;
        pattern1(size);
        pattern2(size);
    }

    public static void pattern1(int n) {
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            char ch = 'A';
            for (int col = 1; col <= n; col++) {
                System.out.print(ch);
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }
}