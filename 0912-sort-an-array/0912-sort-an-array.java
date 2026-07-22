class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer>p = new PriorityQueue<>();
        for(int num:nums){
            p.add(num);
        }
        int i=0;
        while(i<nums.length){
            nums[i]=p.poll();
            i++;
        }
        return nums;
    }
}