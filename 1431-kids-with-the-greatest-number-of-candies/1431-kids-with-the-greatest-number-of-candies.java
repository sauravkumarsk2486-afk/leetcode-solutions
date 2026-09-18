class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int sum=0;
        int n=candies.length;
        
        List<Boolean> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            sum=candies[i]+extraCandies;
            boolean flag=true;
            for(int j=0;j<n;j++){
                
                if(candies[j]>sum){
                    flag=false;
                    break;
                }
            }
            result.add(flag); 
        }
        return result;

        
    }
}