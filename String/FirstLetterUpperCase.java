public class FirstLetterUpperCase {
    // TimeComplexity: O(n)
    public static String upperCaseLetter(String s) {
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);

        for(int i=1;i<s.length();i++) {
            if(s.charAt(i)==' ' && i<s.length()-1){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello my name is Tanuj";
        System.out.println(upperCaseLetter(str));
    }
}
