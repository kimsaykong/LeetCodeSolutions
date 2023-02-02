package Solutions;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> superStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') superStack.push(c);
            else if (superStack.isEmpty()) return false;
            else if (
                    (c==')'&&superStack.peek()!='(') ||
                    (c==']'&&superStack.peek()!='[') ||
                    (c=='}'&&superStack.peek()!='{')
            ) return false;
            else superStack.pop();
        }
        if (superStack.isEmpty()) return true;
        return false;
    }
}
