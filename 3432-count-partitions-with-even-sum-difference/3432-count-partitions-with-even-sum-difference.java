class Solution {
    public int countPartitions(int[] nums) {
        int totalsum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            rightsum=totalsum-leftsum;
            if((rightsum%2) == (leftsum%2)){
                count++;
            }
        }
        return count;
    }
}