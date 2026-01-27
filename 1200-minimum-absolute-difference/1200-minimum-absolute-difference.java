class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        // int mindiff=arr[1]-arr[0];
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
          mindiff=Math.min(Math.abs(arr[i]-arr[i+1]),mindiff);
        }
        List<List<Integer>>res=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==mindiff){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return res;
    }
}