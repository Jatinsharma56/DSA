class Solution {
    public String reversePrefix(String s, int k) {
     String a="";
     int i=k-1;
     while(i>=0){
        a+=s.charAt(i);
        i--;
     } 
     int j=k; 
     while(j<s.length()){
        a+=s.charAt(j);
        j++;
     }  
     return a;
    }
}