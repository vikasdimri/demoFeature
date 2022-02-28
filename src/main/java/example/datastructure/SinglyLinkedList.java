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

    public void print(){
        Node node=this.head;
        while(node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }

    public SinglyLinkedList reverse(){
        SinglyLinkedList list=new SinglyLinkedList();
        Node node=this.head;
        while (node.next!=null){
            list.add(node.data);
            node=node.next;
        }
        list.add(node.data);
        return list;
    }

}

class LinkedListMain {
    public static void main(String args[]) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
        System.out.println("--------");
        SinglyLinkedList reverse = list.reverse();
        reverse.print();
    }
}
