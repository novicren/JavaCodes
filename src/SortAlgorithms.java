class Sort {
    public static void bubbleSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

public class SortAlgorithms {
    public static void main(String[] arg) {

        int[] array = {11, 55, 2, 34, 64, 13, 4, 90};
        Sort.bubbleSort(array);
        System.out.println(java.util.Arrays.toString(array));
    }
}
