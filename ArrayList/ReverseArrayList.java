import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println(al);

        //Time complexity O(1)
        for(int i=al.size()-1;i>=0;i--) {
            System.out.println(al.get(i));
        }
    }
}
