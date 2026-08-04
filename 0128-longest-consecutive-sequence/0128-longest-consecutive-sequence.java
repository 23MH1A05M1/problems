class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer>set = new TreeSet<>();
        int max = Integer.MIN_VALUE;
        if(nums.length==0 ){
            return nums.length;
        }
        // if(nums.length == 1)
        for(int num : nums){
            set.add(num);
        }
        int j=0;
        int ans=0;
        int k=0;
        for(int num:set){
            nums[k]=num;
            k++;
        }
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                max=Math.max(max,i+1-j);
            }
            else if(nums[i]+1 != nums[i+1]){
                ans=i+1-j;
                j=i+1;
                max=Math.max(ans,max);
            }
        }
        return max;
    }
}