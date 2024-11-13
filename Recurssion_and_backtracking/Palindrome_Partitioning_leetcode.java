import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning_leetcode {
    
    public static void main(String[] args) {
        String ques = "Nitin";
        List<String> ll =new ArrayList<>();
        List<List<String>> ans =new ArrayList<>();  
        Break_str(ques,ll , ans);
        System.out.println(ans);
        
    }
    public static void Break_str(String str , List<String> ll  , List<List<String>>ans){
        if(str.length()==0){
            // System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i = 1 ; i<=str.length() ; i++){
            String s  = str.substring(0 , i);
            if(isPallindrome(s)){
                ll.add(s);
                Break_str(str.substring(i), ll , ans);
                ll.remove(ll.size()-1);

            }
           

        }
    }
    public static boolean isPallindrome(String s){
        int i=0 ; 
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;


    }
}
