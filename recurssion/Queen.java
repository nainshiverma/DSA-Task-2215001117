public class Queen{
    public static void main(String[] args) {
        int n= 4;
        boolean[]board = new boolean[n];
        int tq = 2;
        queen_permutation(board , tq , "", 0);
        
    }
    public static void queen_permutation(boolean[] board , int tq , String ans , int qpsf){
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        for(int i=0 ; i<board.length ; i++){
            if(board[i]== false){
                board[i] = true;
                queen_permutation(board , tq , ans+"b"+ i +"q"+qpsf , qpsf+1);
                board[i]=false;

            }
        }

    }

    
}
