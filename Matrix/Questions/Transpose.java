public class Transpose {

    public static void printmatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    
    public static void transpose(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;

        int newMatrix[][] = new int[m][n];

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        printmatrix(newMatrix);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
        transpose(matrix);
    }
}
