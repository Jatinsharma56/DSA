class Solution {
    public int countQuadruplets(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length-3;i++){
             for(int j=i+1;j<nums.length-2;j++){  
                for(int c=j+1;c<nums.length-1;c++){ 
         for(int k=c+1;k<nums.length;k++){
            if(nums[i] + nums[j] + nums[c]==nums[k]){
                count++;
            }
            
        }
     }

        }
        }
        return count;

    }
}