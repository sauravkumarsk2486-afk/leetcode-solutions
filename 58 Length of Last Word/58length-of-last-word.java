class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        char arr[]=s.toCharArray();
        int n=arr.length-1;
        while(n>=0 && arr[n]==' '){
            n--;
        }
        
        for(int i=n;i>=0;i--){
            
            
            if(arr[i]==' '){
                break;
            }
            count++;
        }
        return count;
        
    }
}