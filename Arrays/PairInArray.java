public class PairInArray {
    public static void printPair(int numbers[]) {
        int n=numbers.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    } 

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printPair(arr);
    }
}

// Number of pairs = (n * (n-1)) / 2