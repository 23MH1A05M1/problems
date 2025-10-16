class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer>res=new ArrayList<Integer>();
       int i=0;
       int j=i+1;
       while(j<nums.length){
        int k=nums[i];
        while(k>0){
        res.add(nums[j]);
        k--;
        }
        i+=2;
        j=i+1;
       }
       int result[]=new int[res.size()];
       for(int l=0;l<res.size();l++){
           result[l]=res.get(l);
       }
        return result;
     
    }
}