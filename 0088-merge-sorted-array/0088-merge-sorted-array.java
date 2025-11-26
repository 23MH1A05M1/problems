class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int arr[] = new int[m+n];
         int index=0;
         for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=0){
                arr[index]=nums1[i];
                index++;
            }
         }
         for(int j=0;j<nums2.length;j++){
            if(nums2[j]!=0){
                arr[index]=nums2[j];
                index++;
            }
         }
         Arrays.sort(arr);
         for(int i=0;i<arr.length;i++){
            nums1[i]=arr[i];
         }
    }
}