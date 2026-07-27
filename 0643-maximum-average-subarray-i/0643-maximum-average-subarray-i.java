class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        double max = Double.NEGATIVE_INFINITY;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum += nums[j];
            if(j+1-i==k){
               double Avg = (double)sum/k;
               max = Math.max(Avg,max);
               sum-=nums[i];
               i++;

            }
        }
        return max;
    }
}