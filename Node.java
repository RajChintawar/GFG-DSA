public class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }   
}
class LinkedList {
    Node head;
    void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void delete() {
        if (head == null) {
System.out.println("LL is empty"); 
return;      
        }
        head = head.next;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.insert(10);  
        LL.insert(20);
        LL.insert(30);
        LL.insert(40);

        System.out.println("Linked List elements are: ");
        LL.display();
        System.out.println();
        LL.delete();
        System.out.println("After deletion, Linked List elements are: ");
        LL.display();
    }
}
