public class Example{
    public static void main(String[] args) {
        Samosa samosa1 = Samosa.getSamosa();
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        System.out.println(samosa2.hashCode());
        Jalebi jalebi1 = Jalebi.getJalebi();
        Jalebi jalebi2 = Jalebi.getJalebi();
        System.out.println(jalebi1.hashCode());
        System.out.println(jalebi2.hashCode());
    }
}