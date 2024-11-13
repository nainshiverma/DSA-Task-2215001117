import java.util.*;
public class factorial_head {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n){
        //base case 
        if(n==0){
            return 1;
        }
        
        return (n-1)*n;

    }
    
}
