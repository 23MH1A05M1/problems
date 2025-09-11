class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> arr = new ArrayList<Character>();
        //  String res = new String(s);
        StringBuilder res = new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' ||  s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U') {
                arr.add(s.charAt(i));
            }

        }
        Collections.sort(arr);
        int index=0;
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' ||  s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U') {
               res.setCharAt(i, arr.get(index));
                index++;
            }
            // else{
            //     res.charAt(i)=s.charAt(i);
            // }

        }
        return res.toString();
    }
}