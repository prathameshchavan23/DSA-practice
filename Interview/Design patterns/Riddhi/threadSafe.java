
public class threadSafe {

    private static volatile threadSafe instanceVar = null;

    private threadSafe() {
        System.out.println("Instantiated");
    }

    public static threadSafe getInstance() {
        if (instanceVar == null) {//* optimization
            synchronized (threadSafe.class) {
                if (instanceVar == null) { //* double checking
                    instanceVar = new threadSafe();
                }
            }
        }
        return instanceVar;
    }
}
