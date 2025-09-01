public class longestString{
    public String longestString(String[] strs) {
        if(strs==null||strs.length==0) return "";
        String longest = strs[0];
        for(String s:strs){
            if(s.length()>longest.length()){
                //* will compare first string with every string and update first string value
                longest=s;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        longestString ls = new longestString();
        String[] input = {"apple", "banana", "cherry", "date"};
        String result = ls.longestString(input);
        System.out.println("Longest String: " + result);
    }
}