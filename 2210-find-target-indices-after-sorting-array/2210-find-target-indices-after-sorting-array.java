class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                list.add(i);
            }
        }
        // while(low<high)
        // {
        //     int mid=(low+high)/2;
        //     if(nums[mid]==target)
        //     {
        //         list.add(mid);
        //     }
        //     else if(target<nums[mid]){
        //         high=mid-1;
        //     }
        //      else if(target>nums[mid]){
        //         low=mid+1;
        //     }
        // }
        return list;
    }
}