
// pivot and partition

public class QuickSort {

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int num[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element
        int pidx = partition(num, si, ei);
        quickSort(num, si, pidx - 1); // left
        quickSort(num, pidx + 1, ei); // right
    }

    public static int partition(int[] num, int si, int ei) {
        int pivot = num[ei];
        int i = si - 1; // to make space for elements smaller than pivot
        for (int j = si; j < ei; j++) {
            if (num[j] <= pivot) {
                i++;
                // swap
                int temp = num[j];
                num[j] = num[i];
                num[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        num[ei] = num[i]; // pivot = num[i]
        num[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 3, 2, 3, 1, 5, 6, -4 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
