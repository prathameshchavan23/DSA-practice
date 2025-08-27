public class perfectSquare{
     
     public boolean perfectsq(int num){
        // Math Returns the correctly rounded positive square root of a double value
        int root = (int)Math.sqrt(num);
        return root * root == num;
     }
     public static void main(String[] args) {
         perfectSquare ps = new perfectSquare();
         System.out.println(ps.perfectsq(16));  // true
         System.out.println(ps.perfectsq(14));  // false
     }
}