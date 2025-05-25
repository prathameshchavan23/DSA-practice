public class waveArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        waveDisplay(a);
    }

    private static void waveDisplay(int[][] a) {
        for (int col = 0; col < a[0].length; col++) {
            if (col % 2 == 0) {
                for (int[] ints : a) {
                    System.out.print(ints[col] + " ");
                }
            }
            else{
                for(int r= a.length-1;r>=0;r--){
                    System.out.print(a[r][col]+" ");
                }
            }
        }
    }
}
