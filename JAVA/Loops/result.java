
public class result {
    public static void main(String[] args) {
        int num = 85;
        if (num>90){
            System.out.println("A");
        } else if (num>70 && num <80) {
            //here as 85 is greater than 70 so as in else-if every line get's executed so >70 is second argument and it get's before >80 so it's result will be C but it should be B  so we used && operator
            System.out.println("C");
        } else if (num>80) {
            System.out.println("B");
        }
        else{
            System.out.println("You're loser ");
        }
    }
}
