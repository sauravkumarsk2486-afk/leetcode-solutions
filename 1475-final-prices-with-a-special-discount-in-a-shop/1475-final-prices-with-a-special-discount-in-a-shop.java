
class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int[] ans = prices.clone();

        for (int i = 0; i < prices.length; i++) {
            while (!st.isEmpty() && prices[i] <= prices[st.peek()]) {
                int index = st.pop();
                ans[index] = prices[index] - prices[i];
            }

            st.push(i);
        }

        return ans;
    }
}