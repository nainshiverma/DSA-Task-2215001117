//TO REMOVE THE ELEMENT 
//COMPLEXITY OF REMOVE IS O(1)
public class remove {
    public static void main(String[] args) {
        remove ll = new remove();
        ll.AddLast(90);
        ll.AddLast(80);
        ll.AddLast(70);
        ll.AddLast(60);
        ll.AddLast(50);
        ll.AddAtAddress(-20 , 2);
        System.out.println(ll.removefirst());
        ll.Display();
        
        
    }
    class node{
        node next;
        int data;
    }

    private node head;
    private node tail;
    private int size;
    public void AddFrist(int item){
        node n = new node();
        n.data = item;
        if(size == 0){
            head = n;
            tail = n;
            size++;
        }
        else{
            n.next = head;
            head = n;
            size++;
        }
    }
    public void AddLast(int item){
        // node n = new node();
        // n.data = item;
        if(size == 0){
            AddFrist(item);
        }
        else{
           node n = new node();
            n.data = item;
            tail.next = n;
            tail = n;
            size++;
        }
        
    }
    public void AddAtAddress(int item , int k){
        
        if(k== 0){
            AddFrist(item);
        }
        else if (k == size){
            AddLast(item);
            
        }
        else{
            node n = new node();
            n.data = item;
            node k_1th = Getnode(k-1);
            n.next = k_1th.next;
            k_1th.next = n;
            size++;
        }

    }
    private node Getnode(int k){
        if(k<0 || k>=size){
            //throw new Exception("Bklol index");
        }
        node temp = head;
        for(int i =0 ; i< k ; i++ ){
            temp=temp.next;

        }
        return temp;

    }
    public void Display(){
        node temp = head;
        while(temp !=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println(".");
     }
     public int removefirst(.){
        int rv = head.data;
        if(size == 1){
            head = null;
            tail = null;
            size++;
            
        }
        else{
            node temp = head;
            head = head.next;
            temp.next = null;
        }
        size--;
        return rv;
     }
     
    public int removelast(){
        int rv = tail.data;
        if(size==1){
            removefirst();
        }
        else{
            
            node sl = Getnode(size - 2);
            sl.next = null;
            tail = sl;
            size--;
            
        }
        return rv;
     }
     
     
   
}
    
    

