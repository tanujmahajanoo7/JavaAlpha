public class PowerOfxOptimised {
    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }

        // int halfpowersq = optimizedPower(a, n / 2) * optimizedPower(a, n / 2);
        int halfpower = optimizedPower(a, n / 2);
        int halfpowersq = halfpower * halfpower;

        // if n is odd
        if (n % 2 != 0) {
            halfpowersq = a * halfpowersq;
        }
        return halfpowersq;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 5;

        System.out.println(optimizedPower(a, n));
    }
}
