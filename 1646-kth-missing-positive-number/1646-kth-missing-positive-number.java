class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer>res=new ArrayList<>();
         ArrayList<Integer>missed=new ArrayList<>();
        for(int num:arr)
        {
            res.add(num);
        }
        for(int i=1;i<=arr.length+k;i++){
           if(!res.contains(i))
           {
              missed.add(i);
           }
        }
        return missed.get(k-1);
    }
}