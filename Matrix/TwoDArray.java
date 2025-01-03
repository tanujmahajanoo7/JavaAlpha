// package Matrix;

import java.util.Scanner;

public class TwoDArray {

    public static void minMaxElement(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                minElement = Math.min(minElement,matrix[i][j]);
                maxElement = Math.max(maxElement,matrix[i][j]);
            }
        }
        System.out.println("Minimum Element: " + minElement);
        System.out.println("Maximum Element: " + maxElement);
    }

    public static void searchElement(int matrix[][], int key) {
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(matrix[i][j]==key) {
                    System.out.println("Element found at position (" + i + ", " + j + ")");
                    return;
                }
            }
        }
        System.out.println("Not element found");
    }

    public static void printElement(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void insertElement(int matrix[][]) {
        Scanner sc = new Scanner(System.in);
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        int[][] matrix = new int [3][3];
        insertElement(matrix);
        printElement(matrix);
        searchElement(matrix, 5);
        minMaxElement(matrix);
    }
}
