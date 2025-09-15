class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        int count=0;
       String[] words=text.split(" ");
       for(int i=0;i<words.length;i++)
       {
        boolean result =true;
        for(int j=0;j<words[i].length();j++)
        {
            for(int k=0;k<brokenLetters.length();k++)
            {
                if(brokenLetters.charAt(k)==words[i].charAt(j))
                {
                    result=false;
                    break;
                }
            }
            if (!result) break;
        
        }
        if(result)
        {
            count++;
        }
       }
       return count;
    }
}