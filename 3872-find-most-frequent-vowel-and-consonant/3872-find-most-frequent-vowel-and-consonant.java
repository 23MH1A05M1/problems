class Solution {
    public int maxFreqSum(String s) {
        ArrayList<Integer>vowel=new ArrayList<>();
        ArrayList<Integer>consonents=new ArrayList<>();
        int freq[]=new int[26];
              for(char ch: s.toCharArray()){
                  freq[ch-'a']++;
              } 
              for(int i=0;i<freq.length;i++)
              {
                if(i==0||i==4||i==8||i==14||i==20)
                {
                    vowel.add(freq[i]);
                }
                else
                {
                    consonents.add(freq[i]);
                }
              }  
              return Collections.max(vowel)+Collections.max(consonents) ; 
      }
 }