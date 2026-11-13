class Solution {
    public int[] rearrangeArray(int[] nums) {
        int result[]=new int[nums.length];
        int k=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                while(k<result.length){
                    
                    if(k % 2 !=0){
                        result[k]=nums[i];
                        k++;
                        break;
                    }
                    k++;
                }    
            }
            else{
                while(c<result.length){
                
                    if(c==0 ||c % 2 ==0){
                        result[c]=nums[i];
                        c++;
                        break;
                    }
                    c++;
                }
            }       
        } 
        return result;  
        
    }
}