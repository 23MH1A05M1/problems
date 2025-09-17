class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int max=0;
        for(int num:nums)
        {
            list.add(num);
            if(num>max)
            {
                max=num;
            }
        }
        int res=0;
        for(int i=0;i<=max+1;i++){
            if(!list.contains(i)){
              res=i;
              break;
            }
        }

      return res;
    }
}