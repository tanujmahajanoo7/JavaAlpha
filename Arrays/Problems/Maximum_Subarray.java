import java.util.ArrayList;
import java.util.Scanner;
class Maximum_Subarray {

    public static int maxSubArray(int[] nums) {
        int ms = nums[0];
        int cs = nums[0];
        int n = nums.length;

        for(int i=1;i<n;i++) {
            cs = Math.max(nums[i], cs + nums[i]);
            ms = Math.max(ms,cs);
        }
        return ms;
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

