public class middle_of_ll {
    
    public static void main(String[] args) {
        middle_of_ll l1 = new middle_of_ll();
            l1.AddLast(9);
            l1.AddLast(5);
            l1.AddLast(3);
            l1.AddLast(6);
            l1.AddLast(8);
            l1.AddLast(1);
            l1.display();   
            l1.middle();     
        
    }
    class node{
        int data;
        node next;

    }
    private node head;
    private node tail;
    private int size;
    public void AddFrist(int element){
        node n = new node();
        n.data = element;
        if(size==0){
            head = n;
            tail = n;
        }
        else{
            n.next = head;
            head = n;
            size++;
        }
    }
    public void AddLast(int element){
        node n =new node();
        n.data = element;
        if(size == 0){
            AddFrist(element);
        }
        else{
            // node name =new node();
            // n.data = element;
            tail.next =n;
            tail = n;
            size++;
        }
    }
    public void middle(){
        node slow = head;
        node fast = tail;
        while(fast.next != null &&fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
            System.out.println(slow);

        }
    }
    


    public void display(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println(".");
    }
    
}
