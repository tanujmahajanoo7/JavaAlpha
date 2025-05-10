
public class FirstLetterUpperCase {

    public static String firstLetterUpperCase(String str) {
      StringBuilder sb = new StringBuilder();
      boolean capitalizeNext = true;

      for (int i = 0; i < str.length(); i++) {
          char currentChar = str.charAt(i);
          if (Character.isLetter(currentChar)) {
              if (capitalizeNext) {
                  sb.append(Character.toUpperCase(currentChar));
                  capitalizeNext = false;
              } else {
                  sb.append(currentChar);
              }
          } else {
              sb.append(currentChar);
              if (currentChar == ' ') {
                  capitalizeNext = true;
              }
          }
      }

      return sb.toString();
  }

  public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);
      // String str = sc.nextLine();
      // String res = firstLetterUpperCase(str);
      // System.out.println(res);
      
      System.out.println(firstLetterUpperCase("  Hello i am the common man"));
      // "  Hello I Am The Common Man"
      System.out.println(firstLetterUpperCase("   India is my country"));
      // "   India Is My Country"
      System.out.println(firstLetterUpperCase("India    is my country"));
      // "India    Is My Country"
      System.out.println(firstLetterUpperCase("India     is my country...."));
      // "India     Is My Country...."
  }

  // TimeComplexity: O(n)
  // public static String upperCaseLetter(String s) {
  //     StringBuilder sb = new StringBuilder();
  //     char ch = Character.toUpperCase(s.charAt(0));
  //     sb.append(ch);
  //     for(int i=1;i<s.length();i++) {
  //         if(s.charAt(i)==' ' && i<s.length()-1){
  //             sb.append(s.charAt(i));
  //             i++;
  //             sb.append(Character.toUpperCase(s.charAt(i)));
  //         }
  //         else {
  //             sb.append(s.charAt(i));
  //         }
  //     }
  //     return sb.toString();
  // }
  // public static void main(String[] args) {
  //     String str = "India    is my country....";
  //     System.out.println(upperCaseLetter(str));
  // }
}
