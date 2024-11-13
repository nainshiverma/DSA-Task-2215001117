import java.util.*;
public class Hashset_str_U_L {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        int Hash [] = new int[256];
        for(int  i=0 ; i<s.length() ; i++){
            Hash[s.charAt(i)]++;
        }
        int q = sc.nextInt();
        while(q-->0){
            char c = sc.next().charAt(0);
            System.out.println(Hash[c]);

        }

    }
    
}
