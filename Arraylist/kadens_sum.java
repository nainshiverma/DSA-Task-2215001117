import java.util.Scanner;

public class kadens_sum{
    public static int KadensMaxSum(int[]arr){
        int max_sum = 0;         
        int current_value = 0;
        for(int i = 0 ; i<arr.length ; i++ ){
            current_value = current_value + arr[i];
            if(current_value > max_sum){
                max_sum = current_value;
            }
            if(current_value < 0 ){
                current_value = 0;
        }
    }
    System.out.println(max_sum);
    return max_sum; 
}

    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[]arr = new int[n];
            for(int i = 0 ; i< arr.length ; i++){
                arr[i] = sc.nextInt();
            }
            KadensMaxSum(arr);
            
        }
    }
}


