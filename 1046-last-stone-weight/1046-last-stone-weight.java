class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            pq.add(stone);
        }
        int stone1=0;
        int stone2=0;
        while(pq.size() >1){
          stone1=pq.poll();
          stone2=pq.poll();
          if(stone2<stone1){
            int back = stone1-stone2;
            pq.offer(back);
          }
        }
        if(pq.isEmpty()){
            return 0;
        }
        int result=pq.poll();
        return result;
    }
}