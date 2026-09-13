class Solution {
    public char findTheDifference(String s, String t) {
        
        char arr[]=s.toCharArray();
        char arr1[]=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int i=0;
       
        while(i<arr.length ){
            if(arr[i]!=arr1[i]){
                return arr1[i];
            }
            i++;
            
        }
        
        return arr1[arr1.length-1];
    }
}