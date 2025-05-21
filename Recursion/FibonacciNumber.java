package Recursion;

public class FibonacciNumber {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibnm1 = fib(n - 1);
        int fibnm2 = fib(n - 2);
        return fibnm1 + fibnm2;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(fib(n));
    }
}

// Time Complexity: O(2^n)
// The function makes two recursive calls for each non-base case, leading to an
// exponential growth in calls.
// Space Complexity: O(n)
// The maximum depth of the recursion stack is proportional to the input `n`.