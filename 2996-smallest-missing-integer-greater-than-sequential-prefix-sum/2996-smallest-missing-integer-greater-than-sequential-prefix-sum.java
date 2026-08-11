class Solution {
    public int missingInteger(int[] nums) {
        int i=0;
        int max=1;
        int sum=nums[0];
        for(int j=1;j<nums.length;j++){
         if(nums[j] ==  nums[j-1]+1){
            sum+=nums[j];
         }
         else{
            break;
         }
        }
        ArrayList<Integer>list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        while(list.contains(sum)){
            sum++;
        }
        return sum;
    }
}