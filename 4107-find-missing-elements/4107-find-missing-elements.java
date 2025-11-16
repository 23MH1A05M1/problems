class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        Arrays.sort(nums);
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=nums[0];i<=nums[nums.length-1];i++){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}