class Solution {
    public int maxDepth(String s) {
        Stack<Character>stack=new Stack<>();
        int maxdepth=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
                maxdepth=Math.max(maxdepth,stack.size());
            }
            else if(ch==')'){
                stack.pop();
            }

        }
        return maxdepth;
    }
}