class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        Stack<Character> stk=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='#' && !st.isEmpty()){
                st.pop();
                

            }else if(st.isEmpty() && ch=='#'){
                continue;


            }
            else{
                st.push(ch);
                
            }
        } 
        for(int i=0;i<t.length();i++){
            
            char cha=t.charAt(i);
            if(cha=='#' && !stk.isEmpty() ){
                
                stk.pop();

            }else if(cha=='#' && stk.isEmpty()){
                continue;
            
            }else{
                
                stk.push(cha);
            }
        } 
        StringBuilder str=new StringBuilder("");
        StringBuilder str1=new StringBuilder("");

        for(char ch : stk){
            str.append(ch);

        }
        for(char cha : st){
            str1.append(cha);
        }
        if(str.toString().equals(str1.toString())){
            return true;
        }else{
            return false;
        }
    
    }
}