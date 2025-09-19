class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       ArrayList<Integer> res =  new ArrayList<>();
       HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }
        set1.retainAll(set2);
        for(int i:set1){
            res.add(i);
        }
        Collections.sort(res);
        int arr[]=new int[res.size()];
        int index=0;
        for(int i:res)
        {
            arr[index++]=i;
            return i;
        }
        
        return -1;
        
    }
}