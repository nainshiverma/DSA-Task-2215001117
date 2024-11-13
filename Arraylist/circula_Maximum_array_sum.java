import java.util.*;
public class circula_Maximum_array_sum {
    public static void main(String[] args) {
        int[] arr = {8 , -8 , 9 , -9 , 10 , -11 , 12};
        
    }
    public static int maximum_sum(int arr[]){
        int max_sum = 0;         
        int current_value = 0;
        for(int i = 0 ; i<arr.length ; i++ ){
            current_value=current_value + arr[i];
            if(current_value > max_sum){
                max_sum = current_value;
            }
            // if(current_value < 0 ){
            //     current_value = ;
         }
    }
   
    
        return 0;
}

