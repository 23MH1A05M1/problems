class Solution {
    public String removeStars(String s) {
        Stack<Character>stack=new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
          sb.append(stack.pop());
        }
        str=sb.reverse().toString();
        return str;
    }
}