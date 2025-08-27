public class insertionSort {

    public static void insertionsort(int arr[]){
        for(int i = 1; i<arr.length;i++){
            int currentElement = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j] > currentElement){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentElement;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 9, 6, 8, 5, 4, 9};
        insertionsort(arr);
        System.out.println("Ascending Order :");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }


}
