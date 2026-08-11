class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set = new HashSet<>();
       int left=0;
       int right=0;
       int max =0;
       int n = s.length();
       while(right<n){
            char ch = s.charAt(right);
            if(!set.contains(ch)){
               max=Math.max(max,right-left+1);
               set.add(ch);
               right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
       }
       return max;
    }
}