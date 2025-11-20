// package Linked_List;
// package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    // Time Complexity O(1)
    public void addFirst(int data) {
        //1.Create a newNode
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //2.newNode next = head
        newNode.next = head;    //link

        //3.head = newNode
        head = newNode;
    }

    // Time Complexity O(n)
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();   
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        // System.out.println(ll);
    }
}
