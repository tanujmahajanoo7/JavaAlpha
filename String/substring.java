public class substring {

    public static String subStr(String s, int si, int ei) {
        
        String res= "";

        for(int i=si;i<ei;i++) {
            res += s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "Hello, World!";
        int si = 0;
        int ei = 4;
        System.out.println(subStr(str,si,ei));
    }
}
