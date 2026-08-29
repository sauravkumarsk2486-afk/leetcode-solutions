class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<nums2.length;i++) {
            set.add(nums2[i]);
        }
        HashSet<Integer> resultset = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(set.contains(nums1[i])){
                resultset.add(nums1[i]);
            }
        }
        
        int result[]=new int[resultset.size()];
        Iterator<Integer> it = resultset.iterator();
        for(int i=0;i<resultset.size();i++){
            result[i]=it.next();
        } 
        return result;     
    }
}