class Solution {
    public int singleNumber(int[] nums) {
        // int result=0;
        // for(int i : nums){
        //     result^=i;
        // }
        // return result;

         Map<Integer,Integer>map = new HashMap<>();

      for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
      }
      int res=0;
   for(Map.Entry<Integer,Integer>entry:map.entrySet()){
    if(entry.getValue()==1){
         res=entry.getKey();
    }
   }
     return res;
    }
}