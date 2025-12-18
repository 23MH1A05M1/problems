class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int max=0;
        int min=0;
        for(int i=nums.length-k;i<nums.length;i++){
            max+=nums[i];
        }
        for(int i=0;i<k;i++){
            min+=nums[i];
        }
        return Math.abs(max-min);
    }
}