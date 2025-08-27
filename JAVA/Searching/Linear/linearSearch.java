public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(search(arr, target));
    }

    public static int  search(int[] arr, int target){
        // To search element in range
        for(int i=1; i<arr.length-3;i++){
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
}