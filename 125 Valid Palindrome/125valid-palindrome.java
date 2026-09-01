class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='0' && ch<='9')){
                sb.append(ch);
            }
        }
        if(sb.length()<1){
            return true;
        }
        boolean flag=false;
        int n=sb.length();
        for(int i=0;i<n;i++){
            flag=false;
            if(sb.charAt(i)==sb.charAt(n-1-i)){
                flag=true;
            }else{
                break;
            }
        }
        if(flag==true){
            return true;
        }else{
            return false;
        }
    }
}