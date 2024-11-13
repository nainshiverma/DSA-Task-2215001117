import java.util.*;
public class backtrack_1to_n {
    public static void f3( int i , int n ){
        if(i<1){
            f3(i-1 , n);
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            f3(n , n);
        }
}
    

