class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer>l1 = new ArrayList<>();
        ArrayList<Integer>l2 = new ArrayList<>();
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        // arr1[0] = nums[0];
        // arr2[0]=nums[1];
        l1.add(nums[0]);
        l2.add(nums[1]);
        int j=1;
        int k=1;
        for(int i=2;i<nums.length;i++){
            if(l1.get(j-1)>l2.get(k-1)){
                l1.add(nums[i]);
                j++;
            }
            else{
                l2.add(nums[i]);
                k++;
            }
        }
        for(int i=0;i<l1.size();i++){
            nums[i]=l1.get(i);
        }
        int l=0;
        for(int i=l1.size();i<nums.length;i++){
            nums[i]=l2.get(l);
            l++;
        }
        return nums;
    }
}