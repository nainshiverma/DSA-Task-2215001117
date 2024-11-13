import java.util.*;
public class ARRAYLIST_STRING {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(7);//
        names.add("Ankit");                   // by default initialCapacity is 10
        names.add("Riya");                    //ArrayList is grown by 1.5   "7 X 1.5 = 10.5"
        names.add("Neelam");
        names.add("Rahul");
        names.add("Neela");
        names.add("lila");
        names.add("Reeta");
        names.add("Geeta");
        
        for(int i=0 ; i<names.size() ; i++){
            System.out.println(names.get(i));
        }

        // by using for each loop
        for(String val:names){
            System.out.println(val + " ");
        }
        
        


    }
    
}
