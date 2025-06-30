// package Backtracking;
// If the string contains n elements then 2^n subset can be formed from that string including " "(empty string)

public class FIndSubSet {
    public static void findSubSet(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("Null" + " ");
            } else {
                System.out.print(ans + " ");
            }
            return;
        }
        // Yes choice
        findSubSet(str, ans + str.charAt(i), i + 1);
        // No choice
        findSubSet(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubSet(str, "", 0);
    }
}
