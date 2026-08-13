class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[(nums1.length)+(nums2.length)];
        int index=0;
          for(int num : nums1){
            nums[index]=num;
            index++;
          }
          for(int num : nums2){
            nums[index] = num;
            index++;
          }
          Arrays.sort(nums);
          int start = nums[0];
          int end = nums[nums.length-1];
          double ans = 0.0;
          if(nums.length%2==1){
            return nums[nums.length/2];
          }
          else{
             ans = (nums[(nums.length-1)/2]+nums[((nums.length-1)/2)+1])/2.0;
          }
          return ans;
    }
}