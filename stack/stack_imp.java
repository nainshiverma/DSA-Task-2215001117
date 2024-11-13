import java.util.Stack;

public class stack_imp{
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(10);
        st.push(30);
        st.push(60);
        st.push(80);
        st.push(40);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }

}