import java.util.*;
public class three_face{
    public static void main(String [] args){
        int n = 4;
        dice( n , 0 , "");
    }
    public static void dice(int n , int curr , String ans ){
        if(curr == n){
            System.out.print(ans + " ");
            return;
        }
        if(curr>n){
            return;
        }
        for(int i =1 ; i<=3 ; i++){
            dice(n , curr + i , ans + i);
        }
        // dice(n , curr + 1 , ans + 1);
        // dice(n , curr + 2 , ans + 2);
        // dice(n , curr + 3 , ans + 3);
    }
    
}
