
public class singletonClass {

    private static singletonClass classinstance = null;

    private singletonClass() {
        // private constructor
        System.out.println("Instantiated");
    }

    public static singletonClass getSingClass() {
        // If instance isn't created we'll create it else we'll return it
        if (classinstance == null) {
            classinstance = new singletonClass();
        }
        return classinstance;
    }
}
