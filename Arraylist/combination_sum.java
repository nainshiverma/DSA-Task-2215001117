import java.util.List;

public class combination_sum {
    public static void main(String[] args) {
        int sum = 8;
        int arr[] = {2 , 3 , 5};
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>>ans = new ArrayList<>();
        combination(arr, sum, ll, 0 , ans);
        System.out.println(ans);

    }
    public static void combination(int[]arr,int sum  , List<Integer> ll , int idx , List<List<Integer>> ans){

        if(sum == 0){
            ans.add(new ArrayList<>(ll));
            // System.out.println(ll);
            return;
        }
        for(int i =idx ; i< arr.length ; i++){
            if(sum >= arr[i]){
                ll.add(arr[i]);
                combination(arr, sum-arr[i], ll, i , ans);
                ll.remove(ll.size()-1);
            }
        }
    }

    
}
