
public class Samosa {

    private static Samosa samosa;

    private Samosa() {
        // private constructor
    }
    // Lazy way of creating object, means when client wants
    // public static Samosa getSamosa(){
    //     if(samosa==null){
    //         samosa = new Samosa();
    //     }
    //     return samosa;
    // }

    public static Samosa getSamosa() {

        if (samosa == null) {
            synchronized (Samosa.class) {
                if (samosa == null) {
                    samosa = new Samosa();
                }
            }
            return samosa;
        }


    }
