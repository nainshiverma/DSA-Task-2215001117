// to get the specific address of node
public class linkedList2 {
    public static void main(String[] args) {
        linkedList2 ll = new linkedList2();
        ll.AddLast(90);
        ll.AddLast(80);
        ll.AddLast(70);
        ll.AddLast(60);
        ll.AddLast(50);
        ll.Display();
        ll.Getnode(3);
    }
    class node{
        node next;
        int data;
    }
    private node head;
    private node tail;
    private int size;
    public void AddLast(int item){
         node n = new node();
         n.data = item;
         if(size == 0){
            head = n;
            tail = n;
            size++;
         }
         else{
            tail.next = n;
            tail = n;
            size++;
         }
        

         }
         public void Display(){
            node temp = head;
            while(temp !=null){
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println(".");
         }
         private node Getnode(int k){
            node temp = head;
            for(int i = 0 ; i<k ; i++){
                temp = temp.next;
            }
            return temp;
         }
         //

    }

    

