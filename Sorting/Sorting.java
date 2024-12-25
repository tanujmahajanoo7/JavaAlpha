// package Sorting;

public class Sorting {

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

// ------------------------------------------------------------------------------------------------------
// Time complexity O(n^2)
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

// ------------------------------------------------------------------------------------------------------
// Time complexity for sortedArray o(n)
    public static void bubbleSortSortedArray(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            int swap = 0;
            for(int j=0;j<n-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
                if(swap==0) {
                    System.out.println("array sorted");
                    return;
                }
            }
        }
    }

// ------------------------------------------------------------------------------------------------------
// Time complexity O(n^2)
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            int minIndex = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]>arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // public static void selectionSort(int []arr) {
    //     int n = arr.length;
    //     for (int i = 0; i < n-1; i++) {
    //         for(int j=i+1;j<n;j++) {
    //             if(arr[i]>arr[j]) {
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    // }
    
// ------------------------------------------------------------------------------------------------------
// Time complexity O(n^2)
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for(int i=1;i<n;i++) {
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct pos to insert
            while(prev>=0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }

// ------------------------------------------------------------------------------------------------------
// Time complexity O(n)
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++) {
            largest = Math.max(largest, arr[i]);
        }
        
        int count[] = new int[largest+1];

        for(int i=0;i<n;i++) {
            count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1;i>=0;i--) {
            while(count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

// ------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2};
        // bubbleSort(arr);
        // printArray(arr);
        
        // int arr[] = {1,2,3,4,5};
        // bubbleSortSortedArray(arr);
        // printArray(arr);
        
        // int arr[] = {5,4,1,3,2};
        // selectionSort(arr);
        // printArray(arr);
        
        // int arr[] = {5,4,1,3,2};
        // insertionSort(arr);
        // printArray(arr);
        
        int arr[] = {1,2,5,4,1,3,2};
        countingSort(arr);
        printArray(arr);

    }
}