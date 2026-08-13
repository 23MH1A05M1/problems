class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min =1;
        int max=0;
       
        for(int num : piles){
            max=Math.max(num,max);
        }
         int mintime=max;
        while(min <= max){
            int mid = min + (max-min)/2;
            long time=0;
            for(int i=0;i<piles.length;i++){
            time += (int) Math.ceil((double) piles[i] / mid);
            }
            if(time <= h){
               mintime= Math.min(mintime,mid);
               max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return mintime;
    }
}