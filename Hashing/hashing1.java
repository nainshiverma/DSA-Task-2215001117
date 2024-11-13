import java.util.*;
public class hashing1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ;i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int hash[] = new int[n];
        for(int i = 0 ; i<hash.length ; i++){
            hash[arr[i]] += 1;
        }
        int q = sc.nextInt();
        while(q-- !=0){
            int num = sc.nextInt();
            System.out.println(hash[num]);
        }

    }
 }
