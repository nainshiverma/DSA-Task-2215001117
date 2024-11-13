

import java.util.Stack;
public class insert_element{
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.print(st);
        insert(st , -6);
        System.out.print(st);


    }
    public static void insert(Stack<Integer>st , int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int x = st.pop();
        insert(st , item);
        st.push(x);
    }
}