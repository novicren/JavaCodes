import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAlgorithms {
    public static void main(String[] arg) {

        int[] array = {50, 40, 30, 20, 10};
        System.out.println("Before Sort: " + Arrays.toString(array));

//        bubbleSort(array);
//        selectionSort(array);
//        insertionSort(array);
//        mergeSort(array, 0, array.length - 1);
        recursiveBubbleSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] arr) {
        // Runs through the unsorted part. It shrinks from right to left
        for (int i = arr.length - 1; i >= 1; i--) {
            boolean didSwap = false;

            // Bubbles the largest element to index i
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    didSwap = true;
                }
            }

            if (!didSwap) {
                break;
            }

            System.out.println("Bubble Sort: " + Arrays.toString(arr));
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

            System.out.println("Selection Sort: " + Arrays.toString(arr));
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j -= 1;
            }

            arr[j + 1] = key;

            System.out.println(Arrays.toString(arr));
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {

        // Temporary bucket to store sorted elements
        List<Integer> temp = new ArrayList<>();

        // left starts at beginning of left half (low)
        // right starts at beginning of right half (mid+1)
        int left = low;
        int right = mid + 1;

        // Run while BOTH halves still have unprocessed elements
        // Stops the moment either half is exhausted
        while (left <= mid && right <= high) {

            // Compare current elements from both halves
            // Pick the smaller one, add to temp, advance that pointer
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]); // pick from left, move left pointer forward
            } else {
                temp.add(arr[right++]); // pick from right, move right pointer forward
            }
        }

        // Right half exhausted first, left half still has remaining elements
        // They are already sorted, just dump them into temp as-is
        while (left <= mid) {
            temp.add(arr[left++]);
        }

        // Left half exhausted first, right half still has remaining elements
        // They are already sorted, just dump them into temp as-is
        while (right <= high) {
            temp.add(arr[right++]);
        }

        // Copy sorted elements from temp back into original array
        // i - low converts absolute array index to temp's 0-based index
        // Example: if low=3, i=3 → temp.get(0), i=4 → temp.get(1)
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {

        // Base case: single element or invalid range = already sorted, stop recursing
        if (low >= high) {
            return;
        }

        // Find middle index to split array into two halves
        int mid = (low + high) / 2;

        // DIVIDE: recursively sort left half (low to mid)
        mergeSort(arr, low, mid);

        // DIVIDE: recursively sort right half (mid+1 to high)
        mergeSort(arr, mid + 1, high);

        // CONQUER: both halves are now sorted, merge them into one sorted segment
        merge(arr, low, mid, high);
    }

    public static void recursiveBubbleSort(int[] arr, int n) {
        if (n == 1) return;

        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        recursiveBubbleSort(arr, n - 1);
    }
}
