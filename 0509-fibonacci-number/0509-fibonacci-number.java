class Solution {
    public int fib(int n) {
    if(n==0)
    return 0;
        if(n==1)
        return 1;
        int a=0;
        int b=1;
        int d;
        for(int i=1;i<n;i++){
            d=a+b;
            a=b;
            b=d;
        }
        return b;
    }
}