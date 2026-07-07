    class Solution {
        public int gcd(int a,int b){
            while(a!=b){
                if(a>b){
                    a=a-b;

                }else{
                    b=b-a;
                }

            }
                return a;
            }
        
        public int gcdOfOddEvenSums(int n) {
            int odd=n*n;
            int even=n*(n+1);
            return gcd(odd,even);
            
        }
        }
    