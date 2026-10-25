class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && ch=='*'){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder sh=new StringBuilder();
        for(char ch : st){
            sh.append(ch);

        }
        return sh.toString();
        
    }
}