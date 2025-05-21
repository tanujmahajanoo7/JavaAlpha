// package Recursion;

public class FirstOccurrence {

    public static int fo(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return fo(arr, key, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 7, 9, 2, 6, 3 };
        System.out.println(fo(arr, 6, 0));
    }
}
