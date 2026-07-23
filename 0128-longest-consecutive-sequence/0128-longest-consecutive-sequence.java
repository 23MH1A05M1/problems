class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        Set<Integer> set = new TreeSet<>();

        for(int i=0;i<nums.length;i++){
            // System.out.println(nums[i]);
            set.add(nums[i]);

        }
           int k = 0;
           for (int num : set) {
           nums[k++] = num;
            }
        int j=0;
        int max=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            
            if(i==nums.length-1){
                max=Math.max(max,i+1-j);
            }
           else if(nums[i]+1!=nums[i+1]){
            ans=i+1-j;
            max=Math.max(max,ans);
             j=i+1;
           }
           
           

        }
        return max;
    }
}