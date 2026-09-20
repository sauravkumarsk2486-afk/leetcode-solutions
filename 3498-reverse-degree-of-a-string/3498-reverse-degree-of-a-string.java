class Solution {
    public int reverseDegree(String s) {
        
        int sum=0;
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            int var=123-ch;
            int index=var*(i+1);
            sum+=index;
        }
        return sum;
        
    }
}