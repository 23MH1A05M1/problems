class Solution {
    public String removeOuterParentheses(String s) {
    StringBuilder res = new StringBuilder();
    Stack<Character> stack=new Stack<>();
    for(char ch : s.toCharArray()){
        if(ch=='('){
            if(!stack.isEmpty()){
                res.append(ch);
            }
            stack.push(ch);
        }
        else{
            stack.pop();
            if(!stack.isEmpty()){
                res.append(ch);
            }
        }
    }
    return res.toString();
    }
}