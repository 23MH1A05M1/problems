class Solution {
    public int[] finalPrices(int[] prices) {
        int[] res  = new int[prices.length];
       Stack<Integer> stack=new Stack<>();
       for(int i=prices.length-1;i>=0;i--){
        while(!stack.isEmpty() && stack.peek()>prices[i]){
            stack.pop();
        }
        if(!stack.isEmpty()){
            res[i]=prices[i]-stack.peek();
        }
        else{
            res[i]=prices[i];
        }
        stack.push(prices[i]);
       }
       return res;
    }
}