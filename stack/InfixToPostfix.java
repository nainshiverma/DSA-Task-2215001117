import java.util.Stack;

public class InfixToPostfix {
        static int Prec(char ch){
            switch (ch){
            case '+':
            case '-':
            return 1;

            case '*':
            case '/':
            return 2;

            case '^':
            return 3;


        }
        return -1;
    }


    static String convert(String str){
        String result =  new String("");
        Stack<Character> stack = new Stack<>();

        for(int i =0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result += ch;
            }
            else if(ch=='('){
                stack.push(ch);
            }

            else if(ch== ')'){
                while(!stack.isEmpty()&& stack.peek() != '(' ){
                    result += stack.pop();

                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && Prec(ch)<=Prec(stack.peek())){
                    result += stack.pop();

                }
                stack.push(ch);
            }

        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
            return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }
    public static void main(String[]args){
        String exp = "(p+q)*(m-n)";
        System.out.println("Infix expression " +  exp);
        System.out.println("Prefix expression " +  convert(exp));
    }

}


