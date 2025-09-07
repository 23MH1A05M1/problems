class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[]=new int[101];
        for(int n:nums)
        {
            freq[n]++;
        }
        int max=0;
        for(int i=0;i<101;i++)
        {
            if(freq[i]> 0){
            if(freq[i]>max)
            {
                max=freq[i];

            }
            }
        }
        int count=0;
        for(int f:freq)
        {
            if(f>0)
            {
                if(f==max)
                {
                    count=count+f;
                }
            }
        }
        return count;
    }
}