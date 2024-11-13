import java.util.*;
public class first_occ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("index start from:");
        int index = sc.nextInt();

        System.out.println("item");
        int a = sc.nextInt();
        System.out.println("length of array");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("give array item");
            arr[i] = sc.nextInt(); 
        }
        
        System.out.println(occurance(arr , index , a));
    }
        
    
    public static int occurance(int arr[] , int i , int item ){
        if(i == arr.length){
            return -1;
        }
        
        if(arr[i] == 3){
            return i;
        }
        return occurance(arr , i+1 , item );
        
        

    }
}
    

