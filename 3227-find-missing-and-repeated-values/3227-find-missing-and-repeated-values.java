class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        int res[] = new int[2];
        for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[i].length;j++){
            map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            set.add(grid[i][j]);
           }
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==2)
             res[0]=entry.getKey();
        }
        int n=grid.length;
        int max=Collections.max(set);
        for(int i=1;i<=max+1;i++){
            if(!set.contains(i)){
                res[1]=i;
                break;
            }
        }
        return res;
    }
}