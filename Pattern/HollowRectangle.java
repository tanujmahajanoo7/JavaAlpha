// package Pattern;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 4;
        int col = 5;

        for(int i=0;i<col;i++) {
            for(int j=0;j<row;j++) {
                if(i==0 || i==col-1 || j==0 || j==row-1) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
