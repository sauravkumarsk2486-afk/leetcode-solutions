class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        int n=operations.length;
        for(int i=0;i<n;i++){
            String op=operations[i];
            if(op.equals("+")){
                int top=s.pop();
                int second=s.peek();
                s.push(top);
                s.push(top+second);
            }
            else if(op.equals("D")){
                s.push(2*s.peek());

            }
            else if(op.equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.parseInt(op));
            }
            
        }
        int sum=0;
        for(int score : s){
            sum+=score;
        }
        return sum;
    }
}