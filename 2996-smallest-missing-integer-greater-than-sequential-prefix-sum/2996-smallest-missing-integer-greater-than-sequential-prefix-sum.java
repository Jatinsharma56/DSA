class Solution {
    public int missingInteger(int[] nums) {

        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1)
                sum += nums[i];
            else
                break;
        }

        while (true) {
            int i;

            for (i = 0; i < nums.length; i++) {
                if (nums[i] == sum)
                    break;
            }

            if (i == nums.length)
                return sum;

            sum++;
        }
    }
}