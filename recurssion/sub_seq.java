import java.util.*;
public class sub_seq {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        printSubSeq(str , "");
    }
    public static void printSubSeq(String ques , String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        printSubSeq(ques.substring(1) , ans);
        printSubSeq(ques.substring(1) , ans + ch);

    }
    
}
