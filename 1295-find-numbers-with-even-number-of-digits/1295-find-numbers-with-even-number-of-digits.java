class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9 && nums[i]<99){
                count++;
            }
            if(nums[i]>999 && nums[i]<10000){
                count++;
            }
            if(nums[i]>99999 && nums[i]<1000000){
                count++;
            }
        }
        return count;
        
    }
}