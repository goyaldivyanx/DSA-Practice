
public class SinglyLinkedList {
    public static class Node {
        int data;
        Node next;
        Node(int val){
            this.data = val;
        }
    }
    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0 ;


        void insertAtEnd(int val){
            Node n = new Node(val);
            if(head==null){
                head=n;
                tail = n ;
            }else{
                tail.next = n;
                tail=n;
            }
            size++;
        }


        void insertAtStart(int val){
            Node n = new Node(val);
            if(head == null){
                head = n;
                tail = n;
            }else{
                n.next = head;
                head = n;
            }
            size++;
        }


        void insertAtindex(int val , int idx){
            Node n = new Node(val);
            if(idx==0){
                insertAtStart(val);
                return;
            }
            if(idx==size){
                insertAtEnd(val);return;
            }
            if(idx<0||idx>size){
                System.out.println("Invalid index!");
                return;

            }
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            n.next = temp.next;
            temp.next = n;
            size++;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
        }   
        
        
        void deleteAt(int idx){
            Node temp = head;
            for(int i = 0; i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }


        void getElement(int idx){
            Node temp = head;
            for(int i = 0;i<idx;i++){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public static void main(String[] args) {
         LinkedList list = new LinkedList();

    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);
    list.insertAtStart(5);
    list.insertAtindex(15, 2);

    System.out.println("Linked List after insertions:");
    list.display();

    list.getElement(3);

    list.deleteAt(2);
    System.out.println("\nAfter deleting index 2:");
    list.display();

    System.out.println("\nSize of list: " + list.size);
        
    }
    



 
}