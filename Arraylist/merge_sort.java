import java.util.*;
public class merge_sort{
    public static void main(String[] args) {
        int arr[] = {23 , 12 , 34 , 2 , 44 , 45 , 56};
        int s = 0;
        int e = arr.length - 1;

        System.out.println();
    }
    public static void mergeSort(int arr[] , int s , int e){
        if (s==e){
            int 
        }
        

    }
    public static void merge(int arr[] , int s , int mid  , int e){
        int temp[] = new int[e-s+1];
        int l_a = s ; 
        int r_a = mid+1;
        int idx = 0 ;
        while(l_a <= mid && r_a <=e){
            if(arr[l_a]<= arr[r_a]) {
                temp[idx] = arr[l_a];
                l_a++;
                idx++;
            }
            else{
                temp[idx] = arr[r_a];
                r_a++;
                idx++;
            }
        }
        int count = 0;
        for(int i = s ; i<e ; i++){
            arr[i] = temp[count];
            count++;
        }
        
    }
}