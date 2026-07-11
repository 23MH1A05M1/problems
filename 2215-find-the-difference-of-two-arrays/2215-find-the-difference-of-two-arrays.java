class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer>temp = new ArrayList<>();
        List<List<Integer>>answer = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            int cnt=0;
               for(int j=0;j<nums2.length;j++){
                if(nums1[i]!=nums2[j]){
                    cnt++;
                }
                
               }
            if(cnt==nums2.length && (!temp.contains(nums1[i]) || temp.isEmpty())){
                  temp.add(nums1[i]);
            }
        }
        answer.add(temp);
        temp = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            int cnt=0;
               for(int j=0;j<nums1.length;j++){
                if(nums1[j]!=nums2[i]){
                    cnt++;
                }
                
               }
            if(cnt==nums1.length && (!temp.contains(nums2[i]) || temp.isEmpty())){
                  temp.add(nums2[i]);
            }
        }
        answer.add(temp);
        // System.out.println(temp);
        return answer;
    }
}