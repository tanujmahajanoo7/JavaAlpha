import java.util.Scanner;

class BinarytoDecimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int res = binarytoDecimal(n);
        System.out.println(res);
        sc.close();
    }

    public static int binarytoDecimal(int num) {
        int pow = 0;
        int ld = 0;
        int dec = 0;
        while (num != 0) {
            ld = num % 10;
            dec += ld * Math.pow(2,pow);
            pow++;
            num = num / 10;
        }
        return dec;
    }
}