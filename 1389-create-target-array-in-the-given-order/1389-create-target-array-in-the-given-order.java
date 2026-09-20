class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList<>();
        int target[]=new int[nums.length];
        int i=0;
        int j=0;
        while(i<nums.length){
            int id1=nums[i];
            int id2=index[j];
            list.add(id2,id1);
            i++;
            j++;
        }
        for(int k=0;k<list.size();k++){
            target[k]=list.get(k);
        }
        return target;
        
    }
}