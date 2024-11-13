public class path {
    public static void main(String[] args) {
        int m = 3 ; 
         int n = 3;
         printpath(0 , 0 , m , n , "");
          
        
    }
    // cc = curr col.
    // cr =curr row 
    //  ec = end col.
    //   er = end row
       
    public static void printpath(int cc , int cr , int ec , int er , String ans){
        if(cc == ec && cr == er ){
            System.out.println(ans + " ");
            return;
        }
        if(cc > ec || cr > er ){
            return;
        }
        printpath(cc + 1, cr, ec, er, ans + "H");
        printpath(cc, cr +1, ec , er, ans + "V");


    }
    
}
