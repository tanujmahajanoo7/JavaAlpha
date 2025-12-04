// folder 24.13
class test {
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

    public void addFirst(int data){
        Node nn = new Node(data);
        
        if(head == null) {
            head = tail = nn;
            size++;
            return;
        }


        nn.next = head;
        head = nn;
        size++;

    }

    public void addLast(int data){
        Node nn = new Node(data);

        if(head == null) {
            head = tail = nn;
            size++;
            return;
        }
        

        tail.next = nn;
        tail = nn;
        size++;

    }

    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp  = head;
        while(temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data) {
        Node nn = new Node(data);

        if(index == 0) {
            addFirst(data);
            return;
        }

        Node temp = head;
        int i = 0;

        while(i < index-1) {
            temp = temp.next;
            i++;
        }

        nn.next = temp.next;
        temp.next = nn;
        size++;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
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

    public int removeLast(){
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

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
        
    }
}
