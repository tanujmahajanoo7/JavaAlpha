// Given n friends, each one can remain single or can be paired up with some other friend. 
// Each friend can be paired only once. 
// Find out the total number of ways in which friends can remain single or can be paired up.
// ANS :- (fn-1) + (fn-1) * (fn-2)

public class FriendParingProblem {

    public static int friendsParing(int n) {
        if (n == 1 || n == 2)
            return n;

        // int fnm1 = friendsParing(n - 1);
        // int fnm2 = friendsParing(n - 2);
        // int pairWays = (n - 1) * fnm2;
        // int totalways = fnm1 + pairWays;
        // return totalways;

        return friendsParing(n - 1) + (n - 1) * friendsParing(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friendsParing(3));
    }

}
