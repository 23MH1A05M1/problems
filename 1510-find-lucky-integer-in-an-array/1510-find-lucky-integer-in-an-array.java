class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        ArrayList<Integer>list=new ArrayList();
        for(int num:arr){
           map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            // if(entry.getValue().intValue() == entry.getKey().intValue()){
                if(entry.getValue().equals(entry.getKey())){
               list.add(entry.getKey());
            }
        }
        if (list.isEmpty()) {
            return -1;
        }
        int max=Collections.max(list);
       return max;   
    }
}