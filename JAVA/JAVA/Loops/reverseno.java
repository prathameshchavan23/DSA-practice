public class reverseno {
    public static void main(String[] args) {
        int num = 793522;
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;// as 2*10=20+2=22 and as the no.s will be added here
        }
        System.out.println(ans);
    }
}
