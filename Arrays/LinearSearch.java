public class LinearSearch {
    private static int ls(int arr[], int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    } 
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int key = 5;
        int index = ls(arr, key);
        System.out.println(index);
        key = 10;
        index = ls(arr, key);
        System.out.println(index);
    }
}
