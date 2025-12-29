class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<points.length;i++){
            // for(int j=0;j<points[i].length;j++){
                list.add(points[i][0]);
            // }
        }
        Collections.sort(list);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size()-1;i++){
         max=Math.max(Math.abs(list.get(i)-list.get(i+1)),max);
        }
        return max;
    }
}