class Solution {
    public boolean doesAliceWin(String s) {
        int vowel=0;
        for(int i=0;i<s.length();i++)
        {
                    char ch = s.charAt(i);

            if(ch=='a' || ch=='A' || ch=='e' || ch=='i' || ch=='E' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
            vowel++;
        }
        if(vowel==0)
        {
            return false;
        }
        // else if(vowel%2==1)
        // {
        //     return true;
        // }
        // else if(vowel%2==0)
        // {

        // }
        return true;
    }
}