class StringCompression {
    @SuppressWarnings("static-access")
    public static String strCompress(String str) {
        if (str.length() < 2) {
            return str;
        }

        StringBuilder newStr = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                newStr.append(str.charAt(i));
                if (count > 1) {
                    newStr.append(count);
                }
                count = 1;
            }
        }
        return newStr.length() < str.length() ? newStr.toString() : str;
    }

    public static void main(String[] args) {
        String str = "aaabbccccd";
        System.out.println(strCompress(str));
    }
}