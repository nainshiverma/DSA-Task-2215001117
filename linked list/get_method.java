//GET THE DATA OF FIRST INDEX
//GET THE DATA OF LAST INDEX
//GET THE DATA OF AT INDEX

public class get_method {
    public static void main(String[] args) {
        get_method ll =new get_method();
        ll.AddFrist(20);
        ll.AddFrist(60);
        ll.AddFrist(70);
        ll.AddFrist(80);
        ll.AddFrist(30);
        ll.AddLast(60);
        System.out.println(ll.getfirst());
    
    }
    class node{
        int data;
        node next;
        
    }
    private node head ;
    private node tail;
    private int size;
    public void AddFrist(int item){
        node n = new node();
        n.data = item;
        if(size==0){
            head = n;
            tail = n;
            size++;
    
        }
        else{
            head.next = n;
            head = n;
            size ++;

        }
    
    }
    public void AddLast(int item){
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
    // public void display(){
    //     node temp = head;
    //     while(temp!=null){
    //         System.out.print(temp.data + "-->" );
    //         temp = temp.next;
    //     }
    //     System.out.print(".");
    // }
    public int getfirst(){
        return head.data;
    }
    public int getlast(){
        return tail.data;
    }


}

