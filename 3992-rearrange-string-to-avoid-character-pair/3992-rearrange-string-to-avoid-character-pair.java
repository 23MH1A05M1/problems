class Solution {
    public String rearrangeString(String s, char x, char y) {
      int f=0;
       int l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == x){
                l++;
            }
            if(s.charAt(i) == y){
                f++;
            }
        }
        int i=0;
        // String t = s;
        char[] t= s.toCharArray();
        while(f-->0){
            t[i]=y;
            i++;
        }
        int start=i;
        i=s.length()-1;
        while(l-->0){
            t[i]=x;
            i--;
        }
        for(i=0;i<s.length();i++){
            if(s.charAt(i)!=x && s.charAt(i)!=y){
                t[start]=s.charAt(i);
                start++;
            }
        }
        return new String(t);
        
    }
}