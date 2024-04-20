class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[101][101];
        return count(dp,m,n);
    }
    public int count(int[][] dp ,int row, int col){
        if(row==1 || col==1){
            return 1;
        }
        if (dp[row][col] != 0) {
            return dp[row][col];
        }
        int left = count(dp,row-1,col);
        int right = count(dp,row,col-1);
        dp[row][col] = left+right;
        return dp[row][col];
    }
}