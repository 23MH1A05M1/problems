class Solution {
    public int[] findDegrees(int[][] matrix) {
        int cnt =0;
        int[] arr=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            cnt=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1){
                    cnt++;
                }
            }
            arr[i]=cnt;
        }
        return arr;
    }
}