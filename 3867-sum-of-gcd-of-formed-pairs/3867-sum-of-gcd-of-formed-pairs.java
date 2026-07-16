import java.util.Arrays;

class Solution {
    public long gcdSum(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            nums[i] = gcd(nums[i], max);
        }

        Arrays.sort(nums);

        long sum = 0;

        for (int i = 0; i < nums.length / 2; i++) {
            sum += gcd(nums[i], nums[nums.length - 1 - i]);
        }

        return sum;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}