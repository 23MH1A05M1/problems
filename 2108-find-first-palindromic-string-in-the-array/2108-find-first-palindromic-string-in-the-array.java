class Solution {
    public String firstPalindrome(String[] words) {
        boolean flag=false;
        String s="";
        for(int i=0;i<words.length;i++)
        {
           String word=words[i];
           int left=0;
           int right=word.length()-1;
           boolean found=true;
           int count=0;
           while(left<=right){
              if(word.charAt(left)==word.charAt(right))
              {
                count++;
                 left++;
                 right--;
                 
              }
                else{
                  found=false;
                  break;
                }
           }
           if(found){
           
              s=word;
              break;
           }
        }
        return s;
    }
}