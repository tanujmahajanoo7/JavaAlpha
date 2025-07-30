// Find number of ways to reach from (0,0) to (n-1,m-1) int nXm grid.
// Allow moves right and down
public class GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;
        }
        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
// solution f(x,y) = f(x+1,y) + f(x,y+1)
// Total = down + right
// ways
// Note :- This grid start from top left corner(0,0)
// Time complexity 2^(n+m)