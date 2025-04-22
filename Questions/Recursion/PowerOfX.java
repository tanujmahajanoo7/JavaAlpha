public class PowerOfX {
    public static int powofx(int x, int pow) {
        if (pow == 0)
            return 1;
        return n * powofx(x, pow - 1);
    }

    public static void main(String[] args) {
        System.out.println(powofx(2, 4));
        // 1
    }
}
