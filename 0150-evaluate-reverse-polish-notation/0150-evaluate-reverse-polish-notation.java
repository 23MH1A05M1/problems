class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
       for(int i=0;i<tokens.length;i++){
         String ch = tokens[i];
         if(ch.equals("+")){
            int first=stack.pop();
            int second=stack.pop();
            int sum=first+second;
            stack.push(sum);
         }
         else if(ch.equals("-")){
             int first=stack.pop();
            int second=stack.pop();
            int diff=second-first;
            stack.push(diff);
         }
         else if(ch.equals("*")){
             int first=stack.pop();
            int second=stack.pop();
            int mul=first*second;
            stack.push(mul);
         }
         else if(ch.equals("/")){
             int first=stack.pop();
            int second=stack.pop();
            int div=second/first;
            stack.push(div);
         }
         else{
            stack.push(Integer.parseInt(ch));
         }
       }
       return stack.pop();
    }
}