class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int num:arr){
           map.put(num,map.getOrDefault(num,0)+1);
        }
        int compare=arr.length/4;
        int res=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>compare){
                res=entry.getKey();
                break;
            }
        }
        return res;
    }
}