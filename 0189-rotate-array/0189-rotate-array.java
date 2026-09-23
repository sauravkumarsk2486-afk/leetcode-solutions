class Solution {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        k = k % n;
        int start=0;
        int end=n-1;
        while(end>start){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        start=0;
        end=k-1;
        while(end>start){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        start=k;
        end=n-1;
        while(end>start){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        
    }
}