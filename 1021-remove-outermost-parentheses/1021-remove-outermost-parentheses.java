class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           if(stack.isEmpty()){
              stack.push(ch);
           }
          else if(!stack.isEmpty() && ch=='('){
            stack.push(ch);
            sb.append(ch);
          }
          else if(!stack.isEmpty() && ch ==')' && stack.peek()=='('){
                stack.pop();
                if(!stack.isEmpty()){
                    sb.append(ch);
                }
          }
           
        }
        return sb.toString();
    }
}