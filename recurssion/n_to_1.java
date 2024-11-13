import java.util.*;
public class n_to_1 {
    public static void f2(int i , int n){
        if(i<n){
            System.out.println(n);
            f2(i , n-1);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i=0; 
        int n = sc.nextInt();
        f2(i , n);

        }
    }
    

