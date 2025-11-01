class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        String str="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='i'){
                sb.append(c);
            }
            else{
                sb.reverse();
            }
        }
        str=sb.toString();
        return str;
    }
}