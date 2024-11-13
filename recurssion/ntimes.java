import java.util.*;
public class ntimes {

    public static void f1( int i , int n){
        if (i<n) {
            System.out.println("nainshi");
            f1(i+1 , n);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        f1(i , n);

    }
}
 