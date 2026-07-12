class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        TreeSet<Integer>set = new TreeSet<>();
        int[] res = new int[arr.length];
        int j=0;
        for(int num:arr){
            set.add(num);
        }
        for(int num:set){
            map.put(num,j+1);
            j++;
        }
        for(int i=0;i<res.length;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}