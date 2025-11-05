// Find if any pair in a sorted and rotated arraylist has a target sum
// list = [11,15,6,8,8,10] target=16;

import java.util.ArrayList;

public class PairSum2 {

    // O(n)
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int breakingPoint = -1;
        int n = list.size();
        for(int i=0;i<n;i++) {
            if(list.get(i) > list.get(i+1)){
                breakingPoint=i;
                break;
            }
        }
        int leftPointer = breakingPoint +1;
        int rightPointer = breakingPoint;

        while(leftPointer != rightPointer) {
            // case 1
            if(list.get(leftPointer) + list.get(rightPointer) == target) {
                return true;
            }
            // case 2
            if(list.get(leftPointer) + list.get(rightPointer) < target) {
                //Modulo arithmatic formula
                leftPointer = (leftPointer+1) % n;
            } else {
                // case 3
                //Modulo arithmatic formula
                rightPointer = (n + rightPointer-1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //11,15,6,8,9,10 --> Sorted and Rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2(list, target));
    }
}
