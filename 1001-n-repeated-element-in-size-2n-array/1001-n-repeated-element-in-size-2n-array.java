class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int repeat=nums.length/2;
        for(int num:nums){
           map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==repeat){
                ans=entry.getKey();
                break;
            }
        }
        return ans;
    }
}