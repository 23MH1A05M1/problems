class Solution {
    public int maximumCount(int[] nums) {
        int positive=0;
        int negative=0;
        for(int num:nums)
        {
            if(num>0)
            {
                positive++;
            }
            else if(num<0)
            {
                negative++;
            }
        }
        int max = Math.max(positive,negative);
        return max;
    }
}