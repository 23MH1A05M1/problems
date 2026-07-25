class Solution {
    public int findMiddleIndex(int[] nums) {
         int[] prefix = new int[nums.length+1];
        int[] suffix = new int[nums.length+1];
        prefix[0]=0;
        suffix[suffix.length-1]=0;
        int j=1;
        for(int i=0;i<nums.length;i++){
            prefix[j]=prefix[j-1]+nums[i];
            j++;
        }
        j=suffix.length-2;
        for(int i=nums.length-1;i>=0;i--){
            suffix[j]=suffix[j+1]+nums[i];
            j--;
        }
        for(int i=0;i<prefix.length-1;i++){
            if(prefix[i]==suffix[i+1]){
                return i;
            }
        }
        return -1;
    }
}