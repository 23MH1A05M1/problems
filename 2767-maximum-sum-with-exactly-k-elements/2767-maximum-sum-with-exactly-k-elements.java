class Solution {
    public int maximizeSum(int[] nums, int k) {
        // int sum=0;
        int max=0;
      for(int i=0;i<nums.length;i++)
      {
         if(nums[i]>max)
         {
            max=nums[i];
         }
      }
      int sum=max;
        for(int i=0;i<k-1;i++)
        {
           sum+=max+1;
          max++;
        }
        return sum;
    }
}