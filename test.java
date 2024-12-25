import java.util.Scanner;

class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double input;

        do {
            while (!sc.hasNextDouble()) {
                sc.next();
            }
            input = sc.nextDouble();

            if (input >= 2) {
                count++;
            }
        } while (sc.hasNext());

        System.out.println("You met your daily water intake goal on " + count + " days this week.");
        sc.close();
    }
}