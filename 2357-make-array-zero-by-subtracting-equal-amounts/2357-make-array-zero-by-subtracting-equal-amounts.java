class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
        }
        int count=0;
        while(!pq.isEmpty()){
            int val =pq.poll();
            if(val > 0 && (pq.isEmpty() || val !=pq.peek())){
                count++;
            }
        }
        return count;
    }
}