public class reverseString {
    public static void main(String[] args) {

        String str = "Hey Pratham";
        String str2 = "";

        // for(int i = str.length()-1;i>=0;i--){
        // str2 = str2 + str.charAt(i);
        // }
        // System.out.println("Total "+str2.length());
        // System.out.println("Reversed string "+str2.toUpperCase());

        // * To reverse both words */
        String sarr[] = str.split(" "); // * split where space is teher

        for(String elem:sarr){
            for(int i= elem.length()-1;i>=0;i--){
                str2 = str2 + elem.charAt(i) + " ";
            }
            str2=str2+" ";
        }
        System.out.println(str2);

        for (int i = sarr.length - 1; i >= 0; i--) {
            str2 = str2 + sarr[i] + " ";
        }
        System.out.println(str2);

        //? Palindrome 

        String str3= "MADAM";
        String str4 = "";

        for(int i=str3.length()-1;i>=0;i--){
            str4 = str4+str3.charAt(i);
        }

        if(str3.equals(str4)){
            System.out.println(str3+" is a palindrome");
        }
        else{
            System.out.println(str3+" is not a palindrome");
        }
    }

}
