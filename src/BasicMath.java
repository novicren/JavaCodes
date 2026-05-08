import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicMath {
    public static void main(String[] args) {
        int n = 11;

        int count = countDigits(n);
        int reverse = reverseOfNumber(n);
        boolean palindrome = isPalindrome(n);
        int gcd = gcd(12, 8);
        boolean armstrong = isArmstrong(n);
        List<Integer> divisor = divisorOf(n);
        boolean prime = isPrime(n);

        System.out.println("Digits: " + count);
        System.out.println("Reverse: " + reverse);
        System.out.println("Palindrome: " + palindrome);
        System.out.println("GCD: " + gcd);
        System.out.println("Armstrong: " + armstrong);
        System.out.println("Divisor: " + divisor);
        System.out.println("Prime: " + prime);
    }

    public static int countDigits(int n) {
        return (n == 0) ? 1 : (int) Math.log10(Math.abs(n)) + 1;
    } // O(1)

    public static int reverseOfNumber(int n) {
        int revNum = 0;
        int rem;

        while (n != 0) {
            rem = n % 10;

            if (revNum > Integer.MAX_VALUE / 10
                    || revNum == Integer.MAX_VALUE / 10 && rem > 7) {
                return 0; // overflow guard
            }
            if (revNum < Integer.MIN_VALUE / 10
                    || revNum == Integer.MIN_VALUE / 10 && rem < -8) {
                return 0; // underflow guard
            }

            revNum = (revNum * 10) + rem;
            n /= 10;
        }

        return revNum;
    } // O(log10 n)

    public static boolean isPalindrome(int n) {
        int reversed = reverseOfNumber(n); // reuse, don't duplicate
        return n == reversed;
    } // O(log10 n)

    public static int gcd(int num1, int num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }

        return (num1 == 0) ? num2 : num1;
    } // O(log(min(num1, num2)))

    public static boolean isArmstrong(int n) {
        if (n < 0) return false; // Armstrong numbers are non-negative

        int temp = n;
        int armstrong = 0;
        int digits = countDigits(n); // reuse existing method

        while (n != 0) {
            int rem = n % 10;
            armstrong += (int) Math.pow(rem, digits);
            n /= 10;
        }

        return armstrong == temp;
    } // O(log10 n)

    public static List<Integer> divisorOf(int n) {
        List<Integer> list = new ArrayList<>();

        n = Math.abs(n);
        if (n == 0) {
            return list;
        }

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);

                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }

        Collections.sort(list);
        return list;
    } // O(sqrt(n)log n)

    public static boolean isPrime(int n) {
        int count = 0;

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0 || n / i != i) {
                count++;
            }
        }
        return count == 2;
    } // O(sqrt n)
}
