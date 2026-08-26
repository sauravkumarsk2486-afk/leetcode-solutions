class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> count = new HashSet<>();
         boolean flag=false;
         for(int i=0;i<nums.length;i++){
            if(count.contains(nums[i])){
                flag=true;
            }
            count.add(nums[i]);
         }
         return flag;
    }
}