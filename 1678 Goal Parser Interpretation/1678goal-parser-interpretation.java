class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(i+2<=command.length() && command.substring(i,i+2).equals("()")){
                sb.append("o");
                i=i+1;
            }
            else if(i+4<=command.length() && command.substring(i,i+4).equals("(al)")){
                sb.append("al");
                i=i+3;
            }else{
                sb.append(command.charAt(i));
            }
        }
        return sb.toString();
        
    }
}