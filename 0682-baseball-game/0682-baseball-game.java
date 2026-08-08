class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int sum=0;
                // if(stack.size()>=2){
                    int top=stack.pop();
                    int second=stack.peek();
                    stack.push(top);
                    sum+=top+second;
                    stack.push(sum);
                // }
            }
            else if(operations[i].equals("C")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(operations[i].equals("D")){
                int Double_ele=stack.peek()*2;
                stack.push(Double_ele);
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        int res=0;
        while(!stack.isEmpty()){
            res+=stack.pop();
        }
        return res;
    }
}