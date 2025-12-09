class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty()){
                char top=stack.peek();
                if(top==ch){
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);

        }
        while(!stack.isEmpty()){
        sb.append(stack.pop());
        }
        String str=sb.reverse().toString();
        return str;
    }
}