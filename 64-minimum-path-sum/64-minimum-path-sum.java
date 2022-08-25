class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        return helper(0,0,grid,dp);
    }
    
    int helper(int i,int j,int[][] grid,int[][] dp){
        int m = grid.length;
        int n = grid[0].length;
        if (i >= m || j>=n){
            return Integer.MAX_VALUE;
        }
        
        if (i==m-1 && j==n-1){
            return grid[m-1][n-1];
        }
        
        if (dp[i][j]!=0){
            return dp[i][j];
        }
        
        dp[i][j]= grid[i][j]+Math.min(helper(i,j+1,grid,dp),helper(i+1,j,grid,dp));
        
        return dp[i][j];
    }
}