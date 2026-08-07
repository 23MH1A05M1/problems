class Solution {
    public int trap(int[] height) {
        int[] leftmax = new int[height.length+1];
        int[] rightmax = new int[height.length+1];
         leftmax[0]=height[0];
         rightmax[rightmax.length-1]=height[height.length-1];
        for(int i=1;i<leftmax.length-1;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        for(int i=rightmax.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        int trappedwater=0;
        for(int i=0;i<height.length;i++){
            trappedwater+=(Math.min(rightmax[i],leftmax[i])-height[i]);
        }
        return trappedwater;
    }
}