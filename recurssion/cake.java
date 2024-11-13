public class cake {
    public static void main(String[] args) {
        
    }
    public static void evil_cake(int i , int j , String arr[][]){
        if(arr[i][j] == "S"){
            return;
        }
        if(arr[i][j] == "."){
            evil_cake( i+1 ,  j+1 ,  arr);


        }
                                                                                // S . . .
    }                                                                           // . . . . 
                                                                                // . . S .
}                                                                                
