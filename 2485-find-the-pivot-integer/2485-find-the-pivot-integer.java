class Solution {
    public int pivotInteger(int n) {
        int[] prefix = new int[n+1];
        int[] suffix = new int[n+1];
        prefix[0]=0;
        suffix[n]=0;
        int j=1;
        for(int i=1;i<=n;i++){
           prefix[j]=prefix[j-1]+i;
           j++;
        }
        j=n-1;
        for(int i=n;i>=1;i--){
            suffix[j]=suffix[j+1]+i;
            j--;
        }
        for(int i=0;i<n;i++){
            if(prefix[i]==suffix[i+1]){
                return i+1;
            }
        }
      return -1;
    }
}