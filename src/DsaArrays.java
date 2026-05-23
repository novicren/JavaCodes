import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DsaArrays {
    public static void main(String[] args) {

        int[] nums = {1, 0, 0, 0, 2};
//        Arrays.sort(nums);
//
//        largestElement(nums);
//        secondLargestElementBrute(nums);
//        secondLargestElementOptimal(nums);
//        boolean isSorted = isSorted(nums);
//        System.out.println(isSorted);
//        List<Integer> arr = removeDuplicatesBrute(nums);
//        System.out.print("Without duplicates: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//
//        int indexOfSortedPart = removeDuplicatesOptimal(nums);
//        System.out.print("\nWithout duplicates: ");
//        for (int i = 0; i < indexOfSortedPart; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        leftRotateArrayByOne(nums);
//        System.out.println(Arrays.toString(nums));

//        rightRotateByK(nums, 3);
//        System.out.println(Arrays.toString(nums));
        moveZerosToEndOptimal(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void largestElement(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("Largest: " + max);
    }

    static void secondLargestElementBrute(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max && nums[i] != max) secondMax = nums[i];
            if (nums[i] < max && nums[i] != min) secondMin = nums[i];
        }

        System.out.println("Second smallest element: " + secondMin);
        System.out.println("Second largest element: " + secondMax);
    }

    static void secondLargestElementBetter(int[] nums) {
        if (nums.length <= 1) System.out.println(-1 + " " + -1);;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int num : nums) {
            if (num < secondMin && num != min) secondMin = num;

            if (num > secondMax && num != max) secondMax = num;
        }

        System.out.println("Second small: " + secondMin);
        System.out.println("Second large: " + secondMax);
    }

    static void secondLargestElementOptimal(int[] nums) {
        if (nums.length <= 1) System.out.println(-1 + " " + -1);

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Second small: " + secondMin);
        System.out.println("Second large: " + secondMax);
    }

    static boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) return false;
        }

        return true;
    }

    static List<Integer> removeDuplicatesBrute(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        for (int num : nums) {
            if (!arr.contains(num)) {
                arr.add(num);
            }
        }

        return arr;
    }

    static int removeDuplicatesOptimal(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;

                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    static void leftRotateArrayByOne(int[] nums) {
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++)  {
            nums[i - 1] = nums[i];
        }

        nums[nums.length - 1] = temp;
    }

    static void rightRotateByK(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1); // reverse whole array
        reverse(nums, 0, k - 1); // reverse from 0 to k - 1 (sorts 0 to k - 1 in ascending order)
        reverse(nums, k, n - 1); // reverse from k to n - 1 (sorts k to n - 1 in ascending order)
    }

     static void reverse(int[] nums, int low, int high) {
        while (low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++;
            high--;
        }
    }

    static void moveZerosToEndBrute(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                temp[index++] = num;
            }
        }

        System.arraycopy(temp, 0, nums, 0, n);
    }

    static void moveZerosToEndOptimal(int[] nums) {
        int n = nums.length;
        int j = -1;

       for (int i = 0; i < n; i++) {
           if (nums[i] == 0) {
               j = i;
               break;
           }
       }

       if (j == -1) return;

       for (int i = j  + 1; i < n; i++) {
           if (nums[i] != 0) {
               int temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp;

               j++;
           }
       }
    }
}
