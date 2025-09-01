public class firstUniqueChar{
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        firstUniqueChar fuc = new firstUniqueChar();
        String input = "leetcode";
        int result = fuc.firstUniqChar(input);
        System.out.println("First Unique Character Index: " + result);
    }
}