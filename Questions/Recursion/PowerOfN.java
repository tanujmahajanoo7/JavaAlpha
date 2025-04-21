public class PowerOfN {
    public static int powofN(int n, int pow) {
        if (pow == 0)
            return 1;
        return n * powofN(n, pow - 1);
    }

    public static void main(String[] args) {
        System.out.println(powofN(2, 4));
        // 16
    }
}
