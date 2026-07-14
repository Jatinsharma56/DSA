class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;
        int max = 0;

        // First window
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        max = count;

        int l = 0;

        for (int r = k; r < s.length(); r++) {

            char left = s.charAt(l);
            if (left == 'a' || left == 'e' || left == 'i' || left == 'o' || left == 'u') {
                count--;
            }

            l++;

            char right = s.charAt(r);
            if (right == 'a' || right == 'e' || right == 'i' || right == 'o' || right == 'u') {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}