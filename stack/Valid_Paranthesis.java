import java.util.Stack;

public class Valid_Paranthesis{
    public static boolean isValidParenthesis(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                if (!st.isEmpty()) {
                    char ch = st.peek();
                    if ((s.charAt(i) == ')' && ch == '(') || 
                        (s.charAt(i) == '}' && ch == '{') ||
                        (s.charAt(i) == ']' && ch == '[')) {
                        st.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    
    public static void main(String[] args) {
        System.out.println(isValidParenthesis("(){}[]")); // true
        System.out.println(isValidParenthesis("([{}])")); // true
        System.out.println(isValidParenthesis("({[})"));  // false
    }
}

// Time complexity O(n)
//Optimal


