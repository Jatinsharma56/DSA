class Solution {
    public String reverseWords(String s) {
        StringBuilder result =new StringBuilder();
   String[] word = s.trim().split("\\s+");
        for(int i=word.length-1;i>=0;i--){
            String w=word[i];
            
             result.append(w).append(" ");

        } 
        return result.toString().trim();
        
    }
}