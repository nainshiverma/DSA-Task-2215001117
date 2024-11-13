public class coin_toss_2 {
    public static void main(String[] args) {
        int n =3;
        String a = "";
        HeadTail(n , a);
        System.out.println(count);
       
    }
    static int count = 0;
    public static void HeadTail(int n , String ans ){
       
        if(n == 0){
        System.out.println(ans);
            count++;
            return;
        }
        if(ans.length() == 0 ||ans.charAt(ans.length() - 1) != 'H'){
            HeadTail(n-1 , ans + "H");
        }
        HeadTail(n-1 , ans + "T");
    }
}