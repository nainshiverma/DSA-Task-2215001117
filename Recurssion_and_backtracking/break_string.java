public class break_string {
    public static void main(String[] args) {
        String ques = "Nitin";
        Break_str(ques, "");
        
    }
    public static void Break_str(String str , String ans ){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i = 1 ; i<=str.length() ; i++){
            String s  = str.substring(0 , i);
            Break_str(str.substring(i), ans+ s + "|");

        }
    }
}
