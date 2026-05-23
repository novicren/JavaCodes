import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateOptimal(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    static void rotate(int[] nums, int k) {
            if (k == 0) return;

        int n = nums.length;
        int[] temp = new int[n];
        int i = 0;
        int index = k;

        for (int j = n - k; j < n; j++) {
            temp[i++] = nums[j];
        }

        for (int j = 0; j < n - k; j++) {
            temp[index++] = nums[j];
        }
        System.out.println(Arrays.toString(temp));
    }

    static void rotateOptimal(int[] nums, int k ) {
        if (k == 0) return;

        int n = nums.length;
        int j = 0;

        for (int i = k; i < n; i++) {
            nums[i] = nums[j++];
        }
    }
}
