class Solution {
    public int smallestIndex(int[] nums) {
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            String str = String.valueOf(nums[i]);
           
            sum=0;
            for(int j=0;j<str.length();j++){
                int digit =str.charAt(j)-'0';
                sum+=digit;
            }
            if(sum==i){
                return i;

            }

        }
        return -1;
    }
}