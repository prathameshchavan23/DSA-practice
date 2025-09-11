
import java.util.Stack;

class validParenthesis {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        validParenthesis vp = new validParenthesis();
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        System.out.println(vp.isValid(test1)); // true
        System.out.println(vp.isValid(test2)); // true
        System.out.println(vp.isValid(test3)); // false
    }
}
