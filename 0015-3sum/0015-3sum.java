class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>>triplet = new ArrayList<>();
       Set<List<Integer>> tripletSet = new HashSet<>();
       for(int i=0;i<nums.length-1;i++){
        Set<Integer>set = new HashSet<>();
        for(int j=i+1;j<nums.length;j++){
            int third = -(nums[i]+nums[j]);
            if(set.contains(third)){
                ArrayList<Integer>list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(third);
                Collections.sort(list);
                tripletSet.add(list);
            }
            set.add(nums[j]);
        }
       }
       triplet.addAll(tripletSet);
       return triplet;
    }
}