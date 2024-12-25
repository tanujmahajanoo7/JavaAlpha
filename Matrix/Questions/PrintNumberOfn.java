// package Questions;

public class PrintNumberOfn {

    public static void PrintNumberOfntimes(int matrix[][], int value) {
        int n = matrix.length;
        int m = matrix[0].length;
        int result = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(matrix[i][j] == value) {
                    result ++;
                }
            }
        }
        System.out.println(value + " is found " + result + " times");
    }

    public static void main(String[] args) {
        int[][] matrix = {{4,7,8},{8,8,7}};
        int n = 7;
        PrintNumberOfntimes(matrix,n);
    }
}
