// package Problems;
// Q.For given n lines on x-axis, use 2 lines to form a container such that it holds maximum water
// height = [1,8,6,2,5,4,8,3,7]

import java.util.ArrayList;

public class ContainerWithMostWater {

    //Bruit Force - O(n^2)
    // public static int storeWater(ArrayList<Integer> height) {
    //     int maxArea=0;
    //     for(int line1=0;line1<height.size();line1++) {
    //         for(int line2=line1+1;line2<height.size();line2++) {
    //             int ht = Math.min(height.get(line1),height.get(line2));
    //             int wd = line2 - line1;
    //             maxArea = Math.max(maxArea,ht*wd);
    //         }
    //     }
    //     return maxArea;
    // }

    //Two pointer approach - O(n)
    public static int storeWater(ArrayList<Integer> height) {
        int lp=0,rp=height.size()-1;
        int maxWater = 0;
        while (lp<rp) {
            //calculate the water
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            maxWater = Math.max(maxWater,ht*width);

            //update the pointer
            if(height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // System.out.println(height.size());
        System.out.println(storeWater(height));
    }
}