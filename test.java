// folder 23 start before rivision all the things

import java.util.ArrayList;
import java.util.Scanner;

class test {

    public static int maxSubArray(int[] nums) {
        int ms = nums[0];
        int cs = nums[0];

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        while(sc.hasNext()) {
            int num = sc.nextInt();
            arr.add(num);
        }
        int a[] = new int[arr.size()];

        for(int i=0; i<arr.size();i++) {
            a[i] = arr.get(i);
        }

        System.out.println(maxSubArray(a));

        sc.close(); 
    }
}
