class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int applesum=0;
        for(int i=0;i<apple.length;i++){
           applesum+=apple[i];
        }
      Arrays.sort(capacity);
      int capsum=0;
      int count=0;
      for(int i=capacity.length-1;i>=0;i--){
         capsum+=capacity[i];
         count++;
         if(capsum>=applesum){
            break;
         }
      }
      return count;
    }
}