// package Questions;
// Q. Print numbers from n to 1 (Decreasing Order) 
public class DecreasingOrderNo {

    public static void printDecreasing(int n) {
        //base case
        if(n==1) {
            System.out.println(n);
            return;
        }
        // main working
        System.out.print(n + " ");
        // Recursive call
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printDecreasing(n);
    }
}
