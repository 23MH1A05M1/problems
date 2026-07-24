class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        int diff=0;
        int ans=0;
        while(i<j){
          diff=Math.abs(i-j);
          ans=diff* Math.min(height[i],height[j]);
          max=Math.max(max,ans);
          if(height[i]<height[j]){
            i++;
          }
          else{
            j--;
          }

        }
        return max;
    }
}