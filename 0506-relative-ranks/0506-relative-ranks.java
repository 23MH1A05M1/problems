class Solution {
    public String[] findRelativeRanks(int[] score) {
       PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
       for(int i=0;i<score.length;i++){
        pq.add(new int[]{score[i],i});
       }
       String result[]=new String[score.length];
       int cnt=1;
       while(!pq.isEmpty()){
        int[] pair = pq.poll();
        int num=pair[0];
        int idx=pair[1];
        if(cnt==1){
            result[idx]="Gold Medal";
            cnt++;
        }
        else if(cnt==2){
            result[idx]="Silver Medal";
            cnt++;
        }
        else if(cnt==3){
            result[idx]="Bronze Medal";
            cnt++;
        }
        else{
            int n=cnt;
            String s = Integer.toString(n);
            result[idx]=s;
            cnt++;
        }
       }
       return result;
    }
}