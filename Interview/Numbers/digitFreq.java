public class digitFreq{
    public static int freq(int num,int digit){
        int count = 0;
        while(num>0){
            int digits = num % 10;
            num /=10;
            if(digits==digit){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(freq(123321, 1));  
        System.out.println(freq(123321, 0));  
    }
}