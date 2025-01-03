public class StringBuildersb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for(int i='a';i<='z';i++) {
            sb.append((char)i);
        }
        // Time Complexity: O(26)
        System.out.println(sb);
    }
}
