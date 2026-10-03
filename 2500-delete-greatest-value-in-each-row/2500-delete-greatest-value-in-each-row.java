class Solution {
    public int deleteGreatestValue(int[][] grid) {
        PriorityQueue<Integer>[]pq = new PriorityQueue[grid.length];
        int sum=0;
        for(int i=0;i<grid.length;i++){
            int max=0;
            pq[i]=new PriorityQueue<>(Collections.reverseOrder());
            for(int j=0;j<grid[i].length;j++){
                pq[i].add(grid[i][j]);
            }
        }
        while(!pq[0].isEmpty()){
            int max=0;
            for(int j=0;j<grid.length;j++){
                int val=pq[j].poll();
                max=Math.max(max,val);
            }
            sum+=max;
        }
        return sum;
    }
}