public class SearchRecursively {
    public static class Node{
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

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //Time complexity O(n) space complexity near about O(n)
    public static int helper(Node head, int key) {
        // if head pointing at the end of ll
        if(head == null) {
            return -1;
        }
        // if data is equal to key
        if(head.data == key) {
            return 0;
        }
        // recursion
        int index = helper(head.next, key);
        if(index == -1) {
            return -1;
        }
        return index+1;
    }

    public static int recursiveSearch(int key) {
        return helper(head,key);
    }


    public static void main(String[] args) {
        SearchRecursively ll = new SearchRecursively();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);

        ll.printList();

        System.out.println(ll.recursiveSearch(40));
        System.out.println(ll.recursiveSearch(100));
    }
}
