class Solution {
    public long pickGifts(int[] gifts, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int gift:gifts){
        pq.add(gift);
       }
       int cnt=k;
       while(cnt!=0){
        int val=pq.poll();
        int sqrt =(int)Math.sqrt(val);
        pq.offer(sqrt);
        cnt--;
       }
       long sum=0;
       while(!pq.isEmpty()){
          sum+=pq.poll();
       } 
       return sum;
    }
}