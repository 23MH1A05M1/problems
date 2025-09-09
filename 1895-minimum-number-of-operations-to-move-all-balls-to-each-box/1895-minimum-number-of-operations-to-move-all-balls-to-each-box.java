class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int res[]=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++)
        {
            int diff=0;
            int sum=0;
           for(int j=0;j<boxes.length();j++)
           {
            if(boxes.charAt(j)=='1')
            {
                diff=Math.abs(i - j);
                sum+=diff;
            }
           }
        
         res[i]=sum;
        }
        return res;
    }
}