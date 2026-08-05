class Solution {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
       s=s.replaceAll("[^A-Za-z0-9]","");
     StringBuilder sb = new StringBuilder(s);
      sb.reverse();
       String str =sb.toString();
       if(s.equals(str)){
        return true;
       }
       return false;
       
    }
}