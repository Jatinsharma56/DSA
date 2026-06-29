class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // nums2 ke elements nums1 ke end me daal do
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        // poora array sort kar do
        Arrays.sort(nums1);
    }
}