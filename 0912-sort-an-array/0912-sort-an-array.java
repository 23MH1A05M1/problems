class Solution {
    public int[] sortArray(int[] nums) {
        // PriorityQueue<Integer>p = new PriorityQueue<>();
        // for(int num:nums){
        //     p.add(num);
        // }
        // int i=0;
        // while(i<nums.length){
        //     nums[i]=p.poll();
        //     i++;
        // }
        // return nums;
        HashMap<Integer,Integer>map = new HashMap<>();
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int index=0;
        for(int i=min;i<=max;i++){
            while(map.getOrDefault(i,0)>0){
                  nums[index]=i;
                  index++;
                  map.put(i,map.get(i)-1);
            } 
        }
        return nums;
    }
}