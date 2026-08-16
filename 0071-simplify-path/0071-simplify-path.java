class Solution {
    public String simplifyPath(String path) {
        Stack<String>stack = new Stack<>();
        String[] split = path.split("/");
        for(String s:split){
            if(s.equals(".") || s.equals("")){
                continue;
            }
            else{
                if(s.equals("..") && !stack.isEmpty()){
                    stack.pop();
                }
                else if(!s.equals("..")){
                    stack.push(s);
                }
            }
           

        }
         StringBuilder sb = new StringBuilder();
         if(stack.isEmpty()){
            return "/";
         }
            for(String str:stack){
                sb.append("/");
                sb.append(str);
            }
        return sb.toString();
    }
}