class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int arr1[]=new int[n/2];
        int arr2[]=new int[n/2];
        int res[]=new int[n];
        int pindex=0;
        int nindex=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
               arr1[pindex++]=nums[i];
           
            }
            else if(nums[i]<0)
            {
                arr2[nindex++]=nums[i];
               
            }
        }
        int index1=0;
        for(int i=0;i<res.length;i+=2)
        {
            res[i]=arr1[index1];
            res[i+1]=arr2[index1];
            index1++;
        }
        return res;
    }
}