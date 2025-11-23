class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> set3=new HashSet<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int num1:nums1){
            set1.add(num1);
        }
         for(int num2:nums2){
            set2.add(num2);
        }
         for(int num3:nums3){
            set3.add(num3);
        }
      for(int i:set1){
        map.put(i,map.getOrDefault(i,0)+1);
      }
       for(int i:set2){
        map.put(i,map.getOrDefault(i,0)+1);
      }
       for(int i:set3){
        map.put(i,map.getOrDefault(i,0)+1);
      }
      for(Map.Entry<Integer,Integer>entry:map.entrySet()){
        if(entry.getValue()>1){
            list.add(entry.getKey());
        }
      }
      return list;
    }
}