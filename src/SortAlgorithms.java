import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAlgorithms {
    public static void main(String[] arg) {

        int[] array = {50, 40, 30, 20, 10};
        int[] sortedArray = {10, 20, 30, 40, 50};
        System.out.println("Before Sort: " + Arrays.toString(array));

//        bubbleSort(array);
//        selectionSort(array);
//        insertionSort(array);
        mergeSort(array, 0, array.length - 1);
//        recursiveBubbleSort(array, array.length);
//        recursiveBubbleSortOptimal(sortedArray, sortedArray.length);
//        recursiveInsertionSort(array, 0);
//        quickSort(array, 0, array.length - 1);

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

    private static void merge(int[] arr, int low, int mid, int high) {

        // Initialize temp to store sorted elements
        List<Integer> temp = new ArrayList<>();

        int left = low; // left starts at beginning of left half
        int right = mid + 1; // right starts at beginning of right half

        // Run while both halves still have unprocessed elements
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
        // They are already sorted, just dump them into temp
        while (left <= mid) {
            temp.add(arr[left++]);
        }

        // Left half exhausted first, right half still has remaining elements
        // They are already sorted, just dump them into temp
        while (right <= high) {
            temp.add(arr[right++]);
        }

        // Copy sorted elements from temp back into original array
        // i - low converts absolute array index to temp's 0-based index
        // Example: if low=3, i=3 -> temp.get(0), i=4 -> temp.get(1)
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {

        // Base case: single element or invalid range, already sorted, stop recursing
        if (low >= high) {
            return;
        }

        // Find middle index to split array into two halves
        int mid = (low + high) / 2;

        // Divide: recursively sort left half
        mergeSort(arr, low, mid);

        // Divide: recursively sort right half
        mergeSort(arr, mid + 1, high);

        // Conquer: both halves are now sorted, merge them into one sorted segment
        merge(arr, low, mid, high);
    }

    public static void recursiveBubbleSort(int[] arr, int n) {
        if (n == 1) return;

        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        recursiveBubbleSort(arr, n - 1);
    }

    public static void recursiveBubbleSortOptimal(int[] arr, int n) {
        if (n == 1) return;
        boolean didSwap = false;

        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = true;
            }
        }

        if (!didSwap) return;

        recursiveBubbleSortOptimal(arr, n - 1);
    }

    public static void recursiveInsertionSort(int[] arr, int i) {
        if (i == arr.length) return;

        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;

        recursiveInsertionSort(arr, i + 1);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivotIndex = partition(arr, low, high);

        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
}

