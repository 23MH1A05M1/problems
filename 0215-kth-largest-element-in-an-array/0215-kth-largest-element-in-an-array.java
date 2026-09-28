class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            pq.add(num);
        }
        int cnt=k-1;
        while(cnt!=0){
            pq.poll();
            cnt--;
        }
        int result=pq.poll();
        return result;
    }
}