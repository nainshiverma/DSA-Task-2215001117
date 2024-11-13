public class lexico {
    public static void main(String[] args) {
        int n = 1000;
        lxo(n , 0);
    }
    public static void lxo(int n , int curr ){
        if(curr > n ){
            return;
        }
        System.out.println(curr);
        int i = 0;
        if(curr == 0){
            i = 1;
        }
        for(;  i<+9 ; i++){
            lxo ( n , curr *10 + i );
        }
    }
    
}
