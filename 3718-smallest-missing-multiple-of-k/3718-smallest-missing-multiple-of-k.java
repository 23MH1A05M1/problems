class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i:nums)
        {
            list.add(i);
        }
        int res=0;
        for(int i=1;i<=200;i++){
            if(i%k==0){
               if(!list.contains(i)){
                res=i;
                break;
               }
            }
        }
        return res;
    }
}