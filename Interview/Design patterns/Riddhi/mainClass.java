public class mainClass{
    public static void main(String[] args) {
        // Both obj 
         singletonClass obj = singletonClass.getSingClass();
         System.out.println("Singleton instance: " + obj);
         singletonClass obj2 = singletonClass.getSingClass();
         System.out.println("Singleton instance: " + obj2);
    }
}