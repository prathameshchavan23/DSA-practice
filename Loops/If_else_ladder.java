public class If_else_ladder {
    public static void main(String[] args) {
        int num = 86;
        if(num > 90){
            System.out.println("A");
        }
 //Here program can stop as >70 condition applies here also, so we can use conditionals operators here       
        else if(num>70 && num<80){
           System.out.println("C");
        }
        else if( num>80){
            System.out.println("B");
         }
         else if(num>50){
            System.out.println("D");
         }
    }
}
