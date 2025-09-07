class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int freq[] = new int[101];
        for(int n:nums)
        {
          freq[n]++;
        }
        boolean flag=false;
        for(int i=0;i<101;i++)
        {
            if(freq[i]>1)
            {
                int n=freq[i];
                int count=0;
                for(int j=1;j<=freq[i];j++)
                {
                    if(n % j == 0)
                    {
                     count++;
                    }
                }
                if(count==2)
                {
                   
                   flag=true;
                    break;
                }
            }
        }
        return flag;
    }
}