class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[n - 1];
        int b = nums[n - 2];
        int c = nums[n - 3];

        int x = nums[0];
        int y = nums[1];

        int p1 = a * b * c;
        int p2 = x * y * a;

        if (p1 > p2) {
            
            return p1;
        }

        return p2;
    }
}