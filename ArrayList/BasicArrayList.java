import java.util.ArrayList;

class BasicArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        System.out.println(al);

        //Time complexity O(1)
        al.add(0);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7,7);    //o(n)
        System.out.println(al);

        //Time complexity O(1)
        System.out.println(al.get(0));
        System.out.println(al);

        //Delete //Time complexity O(n)
        al.remove(7);
        System.out.println(al);

        //Set   //Time complexity O(n)
        al.set(6,7);
        System.out.println(al);

        //Contains //Time complexity O(n)
        System.out.println(al.contains(0));
        System.out.println(al.contains(11));

        //Get
        System.out.println(al.get(3));

        //Size
        System.err.println(al.size());
    }
}