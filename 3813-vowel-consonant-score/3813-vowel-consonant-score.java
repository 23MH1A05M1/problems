class Solution {
    public int vowelConsonantScore(String s) {
        String res = s.replaceAll("[\\d\\s]", "");
        int v=0;
        int c=0;
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)=='a' || res.charAt(i)=='e' || res.charAt(i)=='i' || res.charAt(i)=='o' || res.charAt(i)=='u'){
                v++;
            }
            else{
                c++;
            }
        }
        int score=0;
        if(c>0){
        score=(int)Math.floor(v/c);
        }
        return score;
    }
}