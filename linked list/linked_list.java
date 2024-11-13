
import java.util.LinkedList;

public class linked_list{
    public static void main(String[] args) {
       linked_list ll = new linked_list();
        ll.AddFrist(10);
        ll.AddFrist(20);
        ll.AddFrist(30);
        ll.Display();

    }
    class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail ;
    private int size;
    public void AddFrist(int item){
        Node nn = new Node();
        nn.data = item;
        if(size == 0){
            head = nn;
            tail = nn;
            size++;
        }
        else{
            nn.next = head;
            head = nn;
            size++;
        }

        
    }
    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print(".");
    }
   
}