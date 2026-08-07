class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int[] pref = new int[nums.length];
       int[] suf = new int[nums.length];
       int n=nums.length;
       pref[0]=nums[0];
       for(int i=1;i<n;i++){
         if(i%k==0){
           pref[i]=nums[i];
         }
         else{
            pref[i]=Math.max(nums[i],pref[i-1]);
         }

       }
       suf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
         if((i+1)%k==0){
           suf[i]=nums[i];
         }
         else{
            suf[i]=Math.max(nums[i],suf[i+1]);
         }

       }
       int arr[]=new int[(n-k)+1];
       for(int i=0;i<n-k+1;i++){
          arr[i]=Math.max(pref[i+k-1],suf[i]);
       }
       return arr;
    }
}