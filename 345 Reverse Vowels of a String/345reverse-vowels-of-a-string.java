class Solution {
    public static boolean isVowel(char ch) {
            return ch == 'a' || ch == 'A' ||
                ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U';
        }
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int n=arr.length;
        int i=0;
        int j=n-1;
        
        
        while(i<j){
            while (i < j && !isVowel(arr[i])) {
                i++;
            }
            while (i < j && !isVowel(arr[j])) {
                j--;
            }

            
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        
        return new String(arr);
    }

}