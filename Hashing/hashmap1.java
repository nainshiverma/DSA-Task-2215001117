//insert map , put , search
//Iteration
//remove
import java.util.*;
public class hashmap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //country(key) , population(Value)
        //Insertion Function
        map.put("India" , 120);
        map.put("China" ,150);
        map.put("US" , 80);
        System.out.println(map);
        map.put("China" , 180);
        System.out.println(map);
         
        // Search Function
        if(map.containsKey("China")){
            System.out.println("Key is present");
        }
        else{
            System.out.println("Key is not present");
        }
    
        //Get Function
        System.out.println(map.get("China"));//Key exist
        System.out.println(map.get("JAPAN"));//Key not exist
        
        //Iteration
        //for(int val :arr)
        System.out.println("Iteration");
        for(Map.Entry<String , Integer> e:map.entrySet()){
        System.out.print(e.getKey() + " ");
        System.out.print(e.getValue() + " ");
        }

        // Iteration only for keys
        System.out.println("Iteration through keys:");
        Set<String>keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }



        //remove key and value:
        System.out.println("remove china");
        map.remove("China");
        System.out.println(map);
    }


     
    
}
