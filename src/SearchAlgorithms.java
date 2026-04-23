class Search {
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int key) {
        int high = array.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == array[mid]) {
                return mid;
            } else if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }
}

public class SearchAlgorithms {
    public static void main(String[] args) {

        int[] array = {12, 33, 56, 11, 2, 44, 8, 90};
        int[] sortArray = {2, 8, 11, 12, 33, 44, 56, 90};
        int key = 33;

        int result = Search.linearSearch(array, key);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(result);
        }

        result = Search.binarySearch(sortArray, key);
        System.out.println(result);
    }
}