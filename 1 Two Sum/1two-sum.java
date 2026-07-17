class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int addup=nums[i]+nums[j];
                if(addup==target){
                    return new int[]{i, j};
                }

            }
            
        }
        return new int[]{};   
    } 
}