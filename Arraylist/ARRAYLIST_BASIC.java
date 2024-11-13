import java.util.*;


public class ARRAYLIST_BASIC{
    public static void main(String[]args){
        //SYNTAX

        ArrayList<Integer> demo = new ArrayList<>();
        
        //ADD ELEMENT

        demo.add(10);
        demo.add(20);
        demo.add(40);
        demo.add(2 , 11); // phele index phir element  
        
        //PRINT THE WHOLE LIST

        System.out.println(demo);

        //GET PARTICULAR INDEX AND ONLY ONE ELEMENT ACCESS AT A TIME 
        System.out.println(demo.get(1));

        //REMOVE
        System.out.println(demo.remove(1));
        System.out.println(demo);

        // UPADTE
        demo.set(1 , -8);
        System.out.println(demo);

        //size
        System.out.println(demo.size());

        //SORTING
        Collections.sort(demo);
        System.out.println(demo);

    }

}