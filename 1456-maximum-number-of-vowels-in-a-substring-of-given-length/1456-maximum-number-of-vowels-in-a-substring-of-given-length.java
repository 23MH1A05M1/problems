class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int vowel=0;
        int max = Integer.MIN_VALUE;
        for(int j=0;j<s.length();j++){
           char ch = s.charAt(j);
           if(ch == 'a' ||ch == 'e'|| ch == 'i'||ch == 'o'|| ch == 'u'){
            vowel++;
           }
           if(j+1-i == k){
            max = Math.max(vowel,max);
            char ch1 = s.charAt(i);
               if(ch1 == 'a' ||ch1 == 'e'|| ch1 == 'i'||ch1 == 'o'|| ch1 == 'u'){
               vowel--;
             }
             i++;
           }
        }
        return max;
    }
}