class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
         HashMap<Integer,Integer>map1=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            map1.put(entry.getValue(),map1.getOrDefault(entry.getValue(),0)+1);
        }
        for(Map.Entry<Integer,Integer>entry1:map1.entrySet()){
            if(entry1.getValue()>1){
                return false;
            }
        }
        return true;
    }
}