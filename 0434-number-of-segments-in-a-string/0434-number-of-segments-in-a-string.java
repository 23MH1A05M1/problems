class Solution {
    public int countSegments(String s) {
        int count=0;
        
        s=s.trim();
        if(s.isEmpty())
        {
            return 0;
        }
         String[] words = s.split("\\s+");
         for(int i=0;i<words.length;i++)
         {
            count++;
         }
         return count;
    }
}