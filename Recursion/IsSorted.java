public class IsSorted {

    public static boolean IsSort(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return IsSort(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(IsSort(arr, 0));

        int drr[] = { 1, 3, 4, 2, 5, 6 };
        System.out.println(IsSort(drr, 0));

    }
}
