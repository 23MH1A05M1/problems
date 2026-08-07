class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer>list = new ArrayList<>();
        int i=0;
        int j= arr.length-1;
        while((j-i+1!=k)){
            int diff1=Math.abs(arr[i]-x);
            int diff2 = Math.abs(arr[j]-x);
            if(diff1<=diff2){
                j--;
            }
            else{
                i++;
            }
        }
       while(i<=j){
        list.add(arr[i]);
        i++;
       }
        return list;
    }
}