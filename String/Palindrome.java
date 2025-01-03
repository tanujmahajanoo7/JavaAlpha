// package String;

public class Palindrome {

    public static boolean checkPalindrome(String s) {
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        if(checkPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        }
        else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
