class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallest_odd=Integer.MAX_VALUE;
        for(int num : nums1){
            if(num%2==1){
                smallest_odd=Math.min(num,smallest_odd);
            }
        }
        if(smallest_odd == Integer.MAX_VALUE){
            return true;
        }
        else{
            for(int num:nums1){
                if(num%2==0 && num <=smallest_odd){
                    return false;
                }
            }
        }
        return true;
    }
}