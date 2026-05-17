import java.util.Arrays;

public class BasicRecursion {
    public static void main(String[] args) {

        int n = 5;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        String string = "bitib";

        int factorial = factorialOf(n);
        int sum = sumOfnNumbers(n);
        int[] reverseArray = reverseOfArray(arr);
        reverseArrayRecursion(arr, 0, arr.length - 1);
        boolean palindrome = isStringPalindrome(string);
        boolean palindromeRecursive = isStringPalindromeRecursive(string, 0);
        int fib = fibonacciRecursion(n);

        System.out.println("Factorial: " + factorial);
        System.out.print("Name n times: ");
        printName("Ding", 5);
        System.out.println("\nNumbers from 1 to n: ");
        printToN(1, n);
        System.out.println("\nNumbers from n to 1: ");
        printNTo1(n);
        System.out.println("\nSum up to n: " + sum);
        System.out.println("Sum up to n (formula): " + sumOfnNumbersFormula(n));
        System.out.print("Reverse of array: " + Arrays.toString(arr));
        System.out.println("Palindrome: " + palindrome);
        System.out.println("Palindrome using recursion: " + palindromeRecursive);
        System.out.println("Fibonacci number of n: " + fib); // 0 1 1 2 3 5 8
        System.out.println("Fibonacci series up to n: ");
        fibonacciSeries(n);
    }

    public static int factorialOf(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        return n * factorialOf(n - 1);
    }

    public static void printName(String name, int times) {

        if (times == 0) {
            return;
        }

        System.out.print(name + " ");

        printName(name, times - 1);
    }

    public static void printToN(int start, int stop) {
        if (start > stop) {
            return;
        }

        System.out.print(start + " ");

        printToN(start + 1, stop);
    }

    public static void printNTo1(int start) {
        if (start < 1) {
            return;
        }

        System.out.print(start + " ");

        printNTo1(start - 1);
    }

    public static int sumOfnNumbers(int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sumOfnNumbers(n - 1);
    }

    public static int sumOfnNumbersFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static int[] reverseOfArray(int[] arr) {
        int n = arr.length;
        int[] reverse = new int[n];

        for (int i = 0; i < n; i++) {
            reverse[i] = arr[n - i - 1];
        }

        return reverse;
    }

    public static void reverseArrayRecursion(int[] arr, int low, int high) {
        if (low >= high) return;

        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        reverseArrayRecursion(arr, low + 1, high - 1);
    }

    public static boolean isStringPalindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {

            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isStringPalindromeRecursive(String string, int low) {
        if (low >= string.length() / 2) return true;

        if (string.charAt(low) != string.charAt(string.length() - 1 - low)) {
            return false;
        }

        return isStringPalindromeRecursive(string, low + 1);
    }

    public static int fibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    public static void fibonacciSeries(int n) {
        int last = 1;
        int sLast = 0;

        if (n == 0) {
            System.out.print(0);
        } else {
            System.out.print(sLast + " " + last + " ");

            int current;
            for (int i = 2; i <= n; i++) {
                current = last + sLast;
                sLast = last;
                last = current;

                System.out.print(current + " ");
            }
        }
    }
}
