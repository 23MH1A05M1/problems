class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1;
        int[] prifix = new int[nums.length];
        int[] suffix = new int[nums.length];
       
        prifix[0]=1;
        for(int i=1;i<nums.length;i++){
            prifix[i]=prifix[i-1]*nums[i-1];
        }
        suffix[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
       
        for(int i=0;i<nums.length;i++){
            nums[i]=prifix[i]*suffix[i];
        }
        return nums;
        
    }
}