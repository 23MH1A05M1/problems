class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            if(num>0){
            set.add(num);
            }
        }
        int missing=0;
        for(int i=1;i<=nums.length+1;i++){
            if(!set.contains(i)){
                missing=i;
                break;
            }
        }
        return missing;
    }
}