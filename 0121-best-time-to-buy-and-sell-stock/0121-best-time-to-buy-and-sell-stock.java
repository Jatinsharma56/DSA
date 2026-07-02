class Solution {
    public int maxProfit(int[] prices) {
        int mp=Integer.MAX_VALUE;
        int mx=0;
        for(int price:prices){

        
        mp=Math.min(mp,price);
        mx=Math.max(mx,price-mp);
        }
        return mx;
    }
}