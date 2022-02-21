package example.datastructure;


public class SinglyLinkedList {
    class Node {
        public int data;
        public Node next;
    }

    private Node head;

    public void add(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }


}

class LinkedListMain {

    public static void main(String args[]) {
        SinglyLinkedList myLinkedlist = new SinglyLinkedList();
        myLinkedlist.add(1);
        myLinkedlist.add(2);
        myLinkedlist.add(3);
        myLinkedlist.add(4);
        myLinkedlist.add(5);

    }
}
