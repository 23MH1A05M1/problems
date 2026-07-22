class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int count=0;
        int prefixSum=0;
        map.put(0,1);
        for(int num : nums){
         prefixSum+=num;
         int res= prefixSum-k;
         count+=map.getOrDefault(res,0);
         map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;

    }
}