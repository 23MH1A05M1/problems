class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int i=nums[0];
        int j=nums[1];
        int k=nums[nums.length-1];
        int l=nums[nums.length-2];
        int mul1=i*j;
        int mul2=k*l;
        int diff=mul2-mul1;
     return diff;
    }
}