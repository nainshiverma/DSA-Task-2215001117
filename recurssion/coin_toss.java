public class coin_toss {
    public static void main(String[] args) {
        int n =3;
        String a = "";
        HeadTail(n , a);
       
    }
    public static void HeadTail(int n , String ans ){
        if(n == 0){
            int count = 0;
            System.out.println(ans);
            return;
        }
        HeadTail(n-1 , ans +"H");
        HeadTail(n-1 , ans + "T");

    }
    
}
