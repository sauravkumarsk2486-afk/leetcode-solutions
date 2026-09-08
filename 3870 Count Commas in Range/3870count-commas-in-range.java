class Solution {
    public int countCommas(int n) {
        String str=String.valueOf(n);
        int count=0;
        if(str.length()<=3){
            return 0;
        }
        if(n>999){
            count=n-999;
        }
        return count;
        
    }
}