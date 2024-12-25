public class SearchInSortedMatirx {

    // timecomplexity = O(m+n)
    // from right top corner searching
    public static boolean staircaseSearch(int matrix[][], int key) {
        
        int n = matrix.length;
        int row = 0;
        int col = matrix[0].length-1;

        while(row < n && col>=0) {
            if(matrix[row][col] == key) {
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }

        System.out.println("Key not found");
        return false;
    }

    // timecomplexity = O(m+n)
    // from left bottom corner searching
    public static boolean staircaseSearch2(int matrix[][], int key) {
        
        int n = matrix.length;
        int row = n-1;
        int col = 0;

        while(row >= 0 && col < n) {
            if(matrix[row][col] == key) {
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }
            else if(key > matrix[row][col]) {
                col++;
            }
            else {
                row--;
            }
        }

        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int [][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 37;

        staircaseSearch(matrix,key);
        staircaseSearch2(matrix, key);

    }
}
