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
    public static int size;

    // Time Complexity O(1)
    public void addFirst(int data) {
        //1.Create a newNode
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        //2.newNode next = head
        newNode.next = head;    //link

        //3.head = newNode
        head = newNode;
        size++;
    }

    // Time Complexity O(n)
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // Time Complexity O(n)
    public void print() {
        if(head == null) {
            System.out.print("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void add(int index, int data) {
        if(index == 0) {
            addFirst(data);
            size++;
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while(i < index - 1){
            temp = temp.next;
            i++;
        }
        // i=index-1; temp -> prev
        newNode.next = temp.next;
        temp.next=newNode;
        size++;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size - 2
        Node prev = head;
        for(int i=0;i<size-2;i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();   
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.add(2,9);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();

        // System.out.println(ll);
    }
}
