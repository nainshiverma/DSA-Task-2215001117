import java.util.*;
public class kepaid{
    static String[] map = {"" , "", "abc", "def" , "ghi" , "jkl" , "mno" , "pqrs" ,  "tuv" , "wxyz"};
    public static void main(String[] args) {
        List<String> ll  = new ArrayList<>(); 
        String s1 = "23";
        Combinations(s1 , "" , ll);
        
    }
    public static void Combinations(String ques , String ans , List<String> ll){
        if(ques.length()==0){
            ll.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        int num = ch - '0' ;
        String press = map[num];
        for(int i =0 ; i < press.length(); i ++){
            Combinations(ques.substring(1) , ans+press.charAt(i) , ll);
        } 

    }
}
