class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length() ){
             str+=word1.charAt(i);
             str+=word2.charAt(j);
             i++;
             j++;
        }
        
        if(word1.length()>word2.length()){
            while(i<word1.length()){
            str+=word1.charAt(i);
            i++;
            }
        }

        if(word1.length()<word2.length()){
            while(j<word2.length()){
            str+=word2.charAt(j);
            j++;
            }
        }
        return str;
    }
}