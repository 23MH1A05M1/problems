class Solution {
    public int majorityElement(int[] nums) {
        int majority=nums.length/2;
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int res=0;
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            if(entry.getValue() > majority){
                 res=entry.getKey();
            }
        }
        return res;
    }
}