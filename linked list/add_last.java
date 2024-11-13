public class add_last {
    public static void main(String[] args) {
        add_last ll = new add_last();
        ll.AddFrist(20);
        ll.AddFrist(10);
        ll.AddFrist(90);
        ll.AddFrist(40);
        ll.AddFrist(80);
        ll.AddLast(50);
        ll.AddLast(60);
        ll.Display();
    }
    public class Node{
        int data;
        Node next;

    }
    private Node head;
    private Node tail;
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
    public void AddLast(int item){
        if(size==0){
            AddFrist(item);
        }
        else{
            Node nn = new Node();
            nn.data = item;
            tail.next = nn;
            tail = nn;
            size++;
        }

    }
    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print(".");

    }
}
