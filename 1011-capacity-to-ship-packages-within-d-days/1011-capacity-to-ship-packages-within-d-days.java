class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mincap =0;
        int maxcap=0;
        for(int num : weights){
            mincap = Math.max(mincap,num);
            maxcap += num;
        }
        while(mincap < maxcap){
            int mid = mincap+(maxcap-mincap)/2;
            int sum=0;
            int day=1;
            for(int weight:weights){
                if(sum+weight > mid){
                    day++;
                    sum=0;
                }
                sum+=weight;
            }
            if(day <= days){
                maxcap = mid;
            }
            else{
                mincap = mid+1;
            }
        }
        return mincap;
    }
}