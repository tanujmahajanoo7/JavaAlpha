// Q. Given a "2×n" board and tiles of size "2×1", count the number of ways to tile the given board using the "2×1" tiles. 
//    (A tile can either be placed horizontally 1  or vertically.) 

public class Tiling {
    public static int tiling(int n) {
        // base case
        if (n == 0 || n == 1)
            return 1;

        // vertical choice
        int fnm1 = tiling(n - 1);

        // horizontal choice
        int fnm2 = tiling(n - 2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(tiling(n));
    }
}