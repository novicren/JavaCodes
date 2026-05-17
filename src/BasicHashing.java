import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasicHashing {
    public static void main(String[] args) {

        int[] arr = {10, 5, 10, 15, 10, 5};

        countFrequencyBrute(arr);
        countFrequencyOptimal(arr);
//        countFrequencyInput();
        alphaFrequencyOptimal(arr);
    }

    public static void countFrequencyInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + "st element: ");
            arr[i] = scanner.nextInt();
        }

        // pre-computing the frequency
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        // frequency of elements to be found
        int query;
        System.out.print("\nEnter the size of the query array: ");
        query = scanner.nextInt();
        int indexNaming = 1;
        int number;

        while (query-- != 0) {
            System.out.print("Enter the " + indexNaming + "st element: ");
            number = scanner.nextInt();
            indexNaming++;

            System.out.println(number + " appeared " + hash[number] + " times\n");
        }
    }

    public static void countFrequencyBrute(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        int count;

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) continue;
            count = 1; // {10, 5, 10, 15, 10, 5}

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + " " + count);
        }
    }

    public static void countFrequencyOptimal (int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int el : arr) {
            /* iterates through the entire array and add (K, V) pair into map.
             K is each element in the array, V is frequency of the element
             (V + 1) each time the element is visited */
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void alphaFrequencyOptimal(int[] arr) {
        HashMap<Character, Integer> map = new HashMap<>();
        String chars = "abcabd";

        for (int i = 0; i < chars.length(); i++) {
            map.put(chars.charAt(i), map.getOrDefault(chars.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}