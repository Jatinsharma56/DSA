class Solution {
    public int missingMultiple(int[] nums, int k) {
                boolean[] seen = new boolean[101];

        for (int x : nums) {
            seen[x] = true;
        }

        int x = k;

        while (x <= 100 && seen[x]) {
            x += k;
        }

        return x;

        
    }
}