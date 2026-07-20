class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res = new ArrayList<>();
                int m=grid.length;
                int n = grid[0].length;
        while(k-->0){
            int lastele=grid[m-1][n-1];
            for(int i=m-1;i>=0;i--){
                for(int j=n-1;j>=0;j--){
                    if(j>0){
                        grid[i][j]=grid[i][j-1];
                    }
                    else if(i>0){
                        grid[i][j]=grid[i-1][n-1];
                    }
                    else if(i==0 && j==0){
                        grid[i][j]=lastele;
                    }
                   
                   
                }
                
                }
                
            }
            for(int i=0;i<m;i++){
            List<Integer> l1 = new ArrayList<>();
                for(int j=0;j<n;j++){
                    l1.add(grid[i][j]);
                }
                res.add(l1);
            }
            return res;
        }
    }
