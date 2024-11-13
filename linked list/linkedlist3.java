//ADD AT A PARTICULAR INDEX
//COMPLEXITY OF THIS CODE IS O(N)

import org.w3c.dom.Node;

public class linkedlist3{
    public static void main(String[] args) {
        linkedlist3 ll = new linkedlist3();
        ll.AddLast(90);
        ll.AddLast(80);
        ll.AddLast(70);
        ll.AddLast(60);
        ll.AddLast(50);
        ll.AddAtAddress(-20 , 2);
        ll.Display();
        System.out.println(ll.getlast());
        System.out.println(ll.getfirst());
        System.out.println(ll.Getnode(2));
        
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
     public int getfirst(){
        return head.data;
     }
     public int getlast(){
        return tail.data;
     }
     public int getindex(int k){
        return Getnode(k).data ;
     }


    
}
