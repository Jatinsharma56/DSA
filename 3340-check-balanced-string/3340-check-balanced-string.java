class Solution {
    public boolean isBalanced(String num) {
        int e=0;
        int odd=0;
        for(int i=0;i<num.length();i++){
            int dig=num.charAt(i)-'0';
            if(i%2==0){
                e=e+dig;
            }else{
                odd=odd+dig;
            }

        }
        return e==odd;
        
    }
}













