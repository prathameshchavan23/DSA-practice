public class decreasingnaturalnos {

    public static void dcrese(int n){
        if(n==0) return ;
        System.out.print(n + " ");
        dcrese(n-1);
    }
    public static void main(String[] args) {
        dcrese(10);
    }
}
