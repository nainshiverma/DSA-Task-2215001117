public class Maximun_points{
    public static int  maxpoints(int[]arr , int k){
        int n = arr.length-1;
        int lsum=0 ;
        int rsum = 0 ;
        
        int maxsum =0;
        for(int i = 0 ; i<k ; i++){
            lsum = lsum + arr[i];
            maxsum = lsum;
        }
        int ridx = n;
        for(int i = k-1 ; i>0 ; i--){
            lsum = lsum - arr[i];
            rsum = rsum + arr[ridx];
            ridx = ridx-1;
            maxsum = Math.max(maxsum , (lsum +rsum));
        }
        return maxsum; 
    }
    public static void main(String[] args) {
        int k = 4;
        int[]arr = {6,2,3,4,7,2,1,7,1};
        int result = maxpoints( arr , k);
        System.out.println(result);
    }
} 