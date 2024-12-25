public class SumOfNumbersInNthRow {
    
    // public static void SumofRow(int matrix[][], int rowNo) {
    //     int m = matrix[0].length;
    //     int sum = 0;
    //     for (int i = 0; i <= rowNo; i++) {
    //         if((i+1)==rowNo) {
    //             for(int j=0;j<m;j++) {
    //                 sum = sum + matrix[i][j];
    //             }
    //         }
    //     }
    //     System.out.println("Sum of " + rowNo + " is: " + sum);
    // }

    public static void SumofRow(int matrix[][], int rowNo) {
        int sum = 0;
        for(int j=0;j<matrix[0].length;j++) {
            sum += matrix[rowNo-1][j];
        }
        System.out.println("Sum of " + rowNo + " is: " + sum);
    }


    public static void main(String[] args) {
        int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int rowNo = 2;
        SumofRow(matrix, rowNo);
    }
}
