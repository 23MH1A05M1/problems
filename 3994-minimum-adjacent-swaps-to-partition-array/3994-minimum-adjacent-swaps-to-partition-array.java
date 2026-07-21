class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        int p1=0;
        int p2=0;
        int p3=0;
        int mod = (int)(1e9 + 7);
        int minimum_swap=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<a){

                p1++;
                minimum_swap+=p2+p3;
            }
            else if(nums[i]<=b && nums[i]>=a){
                p2++;
                minimum_swap+=p3;
            }
            else{
                p3++;
            }
            minimum_swap=minimum_swap%mod;

        }
        return minimum_swap;

    }
}