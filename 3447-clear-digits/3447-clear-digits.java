class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        String str="";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!Character.isDigit(ch)){
              stack.push(ch);
            }
            else{
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
        sb.append(stack.pop());
        }
       str=sb.reverse().toString();
       return str;
    }
}