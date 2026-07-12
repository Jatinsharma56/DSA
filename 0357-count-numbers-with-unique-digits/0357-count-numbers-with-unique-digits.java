class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        int ans=10;
        int uni=9;
        int avail=9;
        while(n>1&&avail>0){
            uni*=avail;
            ans+=uni;
            avail--;
            n--;
        }
        return ans;
    }
}