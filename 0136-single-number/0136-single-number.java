class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        int result=0;
        for(int i=0;i<nums.length;i++)
        {  
            result = result^nums[i];
        }
        return result;
    }
}