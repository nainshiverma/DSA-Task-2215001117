import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int f = pow1(x , y );
        System.out.println(f); 
    }
    public static int pow1(int a , int b){
        if(b==0){
            return 1;
        }
        int ans = pow1(a , b-1);
        return ans = ans *a;
        
        
    }

    
}
