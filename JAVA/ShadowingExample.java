public class ShadowingExample {
    int x = 10; // Class-level variable

    void display() {
        int x = 20; // Local variable shadows class-level x
        System.out.println("Local x: " + x);  // Outputs 20
        System.out.println("Class-level x: " + this.x);  // Outputs 10
        // Inside display, x refers to the local variable (20), and this.x refers to the class-level variable (10).
    }

    public static void main(String[] args) {
        ShadowingExample obj = new ShadowingExample();
        obj.display();
    }
}
