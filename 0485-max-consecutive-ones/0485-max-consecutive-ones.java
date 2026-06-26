class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int j=0;
        int max=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                if(nums[i]==1){
                    cnt++;
                 max = Math.max(cnt,max);
                }
                else{
                    max = Math.max(cnt,max);
                }
            }
           else if(nums[i]==1){
              cnt++;
           }
           else{
            max = Math.max(cnt,max);
            cnt=0;
            j=i;
           }
        }
        return max;
    }
}