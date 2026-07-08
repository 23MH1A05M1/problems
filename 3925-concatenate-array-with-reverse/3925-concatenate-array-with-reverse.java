class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr = new int[nums.length*2];
        int k=nums.length;
        for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
             arr[i]=nums[i];
             arr[k]=nums[j];
             k++;
        }
        return arr;
    }
}