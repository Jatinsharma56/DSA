class Solution {
    public int getSum(int a, int b) {
      for (int i = 0; b != 0; i++) {

            int carry = (a & b) << 1;  
            a = a ^ b;                
            b = carry;                
        }

        return a;
    }
}