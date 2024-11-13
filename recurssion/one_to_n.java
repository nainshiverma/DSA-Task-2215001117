import java.util.*;
public class one_to_n{
    public static void f1(int n, int i){
        if(i<n){
            System.out.println(i);
            f1(n , i+1);
        }

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i=0 ;
    f1(n , i);

    }
}
    

