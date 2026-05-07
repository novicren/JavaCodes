public class Test {
    public static void main(String[] args) {

        int n = -1;

        int count = countDigits(n);
        int reverse = reverseOfNumber(n);
        boolean palindrome = isPalindrome(n);
        int gcd = gcd(12, 8);
        boolean armstrong = isArmstrong(n);

        System.out.println(armstrong);
    }

    public static int countDigits(int n)  {
        return (n == 0) ? 1 : (int) Math.log10(Math.abs(n)) + 1;
    } // O(1)

    public static int reverseOfNumber(int n) {
        int rev_num = 0;
        int rem;

        while (n != 0) {
            rem = n % 10;

            if (rev_num > Integer.MAX_VALUE / 10 || rev_num == Integer.MAX_VALUE / 10 && rem > 7) {
                // Edge case: Integer overflow
                return 0;
            }
            if (rev_num < Integer.MIN_VALUE / 10 || rev_num == Integer.MIN_VALUE / 10 && rem < -8) {
                // Edge case: Integer underflow
                return 0;
            }

            rev_num = (rev_num * 10) + rem;
            n /= 10;
        }
        return rev_num;
    } // O(log10(n))

    public static boolean isPalindrome(int n) {
        int rev_num = 0;
        int rem;
        int temp = n;

        while (n != 0) {
            rem = n % 10;

            if (rev_num > Integer.MAX_VALUE / 10 || rev_num == Integer.MAX_VALUE / 10 && rem > 7) {
                // Edge case: Integer overflow
                return false;
            }
            if (rev_num < Integer.MIN_VALUE / 10 || rev_num == Integer.MIN_VALUE / 10 && rem < -8) {
                // Edge case: Integer underflow
                return false;
            }

            rev_num = (rev_num * 10) + rem;
            n /= 10;
        }
        return temp == rev_num;
    } // O(log10(n))

    public static int gcd(int num1, int num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        while (num1 > 0 && num2 > 0) {
            if (num1 > num2)  num1 = num1 % num2;
            else num2 = num2 % num1;
        }

        if (num1 == 0) return num2;
        return num1;
    } // O(log(min(num1, num2)))

    public static boolean isArmstrong(int n) {
        int digits;
        int armstrong = 0;
        int rem;
        int temp = n;

        digits = (int)Math.log10(Math.abs(n)) + 1;
        while (n != 0) {
            rem = n % 10;
            armstrong += (int) Math.pow(rem, digits);
            n /= 10;
        }

        return armstrong == temp;
    }
}

