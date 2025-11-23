// Search (Iterative)
// Search for a key in a Linked List. Return the position where it is found.
// If not found, return -1.

import java.util.LinkedList;

public class SearchInLinkedList {

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

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static int searchWithKey(int key) {

        int i = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return i; // key found
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);
        addLast(50);

        printList();
        
        System.out.println(searchWithKey(10));   // 0
        System.out.println(searchWithKey(100));  // -1
    }
}
