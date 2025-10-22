class Solution {
    public int diagonalSum(int[][] mat) {
        int n= mat.length;
         int psum=0;
            int ssum=0;
        for(int i=0;i<n;i++)
         {
            psum+= mat[i][i];
            ssum+=mat[i][n-1-i];
         }
         if(n%2==1)
         {
            ssum=ssum-mat[n/2][n/2];
         }
         return psum+ssum;
    }
}