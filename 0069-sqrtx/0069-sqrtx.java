class Solution {
    public int mySqrt(int x) {
        for(double i=0;i<=x;i++){
            if(i*i>x){
                return (int)(i-1);
            }
        }
        return x;
        
    }
}