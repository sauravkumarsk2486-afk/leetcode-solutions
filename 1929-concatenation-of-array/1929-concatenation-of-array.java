class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i]; 
        }
        int i=0;
        int j=nums.length;
        while(j<2*nums.length){
            ans[j]=nums[i];
            i++;
            j++;
        }
        return ans;

    }
}