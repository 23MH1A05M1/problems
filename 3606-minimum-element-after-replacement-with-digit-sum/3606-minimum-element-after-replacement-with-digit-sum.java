class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int sum = 0;
            while(nums[i] !=0)
            {
               int digit = nums[i]%10;
               sum+=digit;
               nums[i]=nums[i]/10;
            }
            nums[i]=sum;
        }
         Arrays.sort(nums);
        return nums[0];
    }
}
