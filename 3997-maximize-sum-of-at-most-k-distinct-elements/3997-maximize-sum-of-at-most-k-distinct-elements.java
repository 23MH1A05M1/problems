class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        
        int count = 0;
        for (int i = nums.length - 1; i >= 0 && count < k; i--) {
           
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                list.add(nums[i]);
                count++;
            }
        }
       int arr[]=new int[list.size()];
       for(int i=0;i<list.size();i++)
       {
        arr[i]=list.get(i);
       }
       return arr;
    }
}