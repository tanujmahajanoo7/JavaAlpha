public class SubArray {
// ---------------------------------------------------------------------------------------

// Time complexity O(n^3)

    public static void printSubarray(int numbers[]) {
        int count = 0;
        int ma=numbers[0];
        int mi=numbers[0];
        int n = numbers.length;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                int sum=0;
                for(int k=i;k<=j;k++) {
                    System.out.print(numbers[k] + " ");
                    sum+=numbers[k];
                }
                ma = Integer.max(ma,sum);
                mi = Integer.min(mi,sum);
                count++;
                System.out.println();
            }
            // System.out.println();
        }
        System.out.println("count: " + count);
        System.out.println("Maximum sum: " + ma);
        System.out.println("Minimum sum: " + mi);
    }

// ---------------------------------------------------------------------------------------

// Time complexity = O(n^2)
// Prefix Sum

    public static void prefixSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        int n = numbers.length;
        
        prefix[0]=numbers[0];
        // calculate prefix sum
        for(int i=1;i<n;i++) {
            prefix[i]=prefix[i-1] + numbers[i];
        }

        for(int i=0;i<n;i++) {
            int start=i;
            for(int j=i;j<n;j++) {
                int end = j;
                currSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum<currSum) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

// ---------------------------------------------------------------------------------------

// Time complexity = O(n)
// Kadanes Algorithm

    public static void Kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int n=numbers.length;
        for(int i=0;i<n;i++) {
            cs += numbers[i];
            if(cs < 0 ) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Maximum sum: " + ms);
    }

// All neagative value case is not cover in this function

// ---------------------------------------------------------------------------------------

    public static void KadanesNegative(int numbers[]) {
        int cs=numbers[0];
        int ms=Integer.MIN_VALUE;
        int n=numbers.length;
        boolean flag = true;

        for(int i=0;i<n;i++) {
            if(numbers[i]>0) {
                flag = false;
            }
        }
        if (flag==false) {
            for(int i=0;i<n;i++) {
                cs += numbers[i];
                if(cs < 0 ) {
                    cs = 0;
                }
                ms = Math.max(ms, cs);
            }
            System.out.println("Maximum sum: " + ms);
        }
        else {
            for(int i=0;i<n;i++) {
                ms = Math.max(ms, numbers[i]);
            }
            System.out.println("Maximum sum: " + ms);
        }
    }
    
// Neagative case is cover in this function

// ---------------------------------------------------------------------------------------

    public static void main(String[] args) {
        // int arr[] = {1,-2,6,-1,3};
        // prefixSum(arr);
        // int arr[] = {-2,-3, 4,-1, -2, 1, 5, -3};
        // Kadanes(arr);
        // int arr[] = {-2,-3, -4, -1, -2, -1, -5, -3};
        // KadanesNegative(arr);
    }
}

// SUb-Array should be continuous always
// Number of SubArray = (n* (n+1)) / 2