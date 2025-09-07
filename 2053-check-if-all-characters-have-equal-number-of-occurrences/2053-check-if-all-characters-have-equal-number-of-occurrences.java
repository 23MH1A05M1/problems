class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[] = new int[26];
        for(char ch:s.toCharArray())
        {
                freq[ch-'a']++;
        }
        int expected=0;
       for(int f:freq)
       {
         if(f>0)
         {
            if(expected==0)
            {
                expected=f;
            }
            else if(expected!=f)
            {
                return false;
            }
         }
       }
        return true;
    }
}