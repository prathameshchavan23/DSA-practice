
class longestPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        // as we've taken care of o so will start looping from 1
        for (int i = 1; i < strs.length; i++) {

            while (strs[i].indexOf(prefix) != 0) {
                // we'll cut the prefix by the end
                prefix = prefix.substring(0, prefix.length() - 1);
                // If prefix becomes empty then there's no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        longestPrefix lp = new longestPrefix();
        String[] strs = {"flower", "flow", "flight"};
        String result = lp.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}
