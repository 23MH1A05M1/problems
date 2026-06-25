class Solution {
    public int removeDuplicates(int[] nums) {
    //    Set <Integer> s = new HashSet<>();
    //     for(int i=0;i<nums.length;i++){
    //         s.add(nums[i]);
    //     }
    //     List<Integer>l=new ArrayList<>(s);
    //     for(int i=0;i<s.size();i++){
    //         nums[i]=l.get(i);   
    //     }
    //     return s.size();

     int i=0;
     for(int j=1;j<nums.length;j++){
        if(nums[i]!=nums[j]){
            nums[i+1]=nums[j];
            i++;
        }
     }
     return i+1;
    }
}