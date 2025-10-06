class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int ans[] = new int[2];
        int i=0;
        Map<Integer,Integer>map = new HashMap<>();
        for(int num : nums)
        {
            if(map.containsKey(num))
            {
                map.put(num,map.get(num)+1);
                if(map.get(num) == 2)
                {
                    ans[i++] = num;
                }

            }
            else
            {
                map.put(num,1);
            }
        }
        return ans;
    }
}