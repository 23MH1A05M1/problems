class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>=2){
                 res=entry.getKey();
                break;
            }
        }
        return res;
        // int res=0;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             res=nums[i];
        //             break;
        //         }
        //     }
        // }
        // return res;
    }
}