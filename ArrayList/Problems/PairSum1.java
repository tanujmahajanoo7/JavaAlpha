// Find if any pair in a sorted ArrayList has a target sum
// list = [1,2,3,4,5,6]  target=5
// bruit force
// all possible pairs took o(n^2)

import java.util.ArrayList;

public class PairSum1 {
    //Brute Force
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for(int i=0;i<list.size();i++) {
            for(int j=i+1;j<list.size();j++) {
                if(list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int lp=0,rp=list.size()-1;
        while(lp != rp) {
            // case 1
            if(list.get(lp)+list.get(rp) == target) {
                return true;
            }
            // case 2
            if(list.get(lp)+list.get(rp) < target) {
                lp++;
            } 
            // case 3
            else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 50;

        System.out.println(pairSum1(list, target));
        System.out.println(pairSum2(list, target));
        
    }
}
