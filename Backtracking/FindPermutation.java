// Array of length n will have n permutations = n!
// String of length n characters will have n permutations = m! 

public class FindPermutation {

    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        // Time Complexity = O(n * n!)
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" => "ab" + "de"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        findPermutation(s, "");
    }
}
