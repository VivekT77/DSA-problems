class Solution {
    public int[][] generateMatrix(int n) {

        int [][] ans=new int[n][n];
        int start_row = 0, start_col= 0, end_row =n-1, end_col = n-1;
        int value=1;
        while(value<=n*n){
            for(int i=start_col; i<=end_col;i++){
                ans[start_row][i] = value++;
            }
            for(int i=start_row+1; i<=end_row;i++){
                ans[i][end_col] = value++;
            }
            if( start_col<=end_col){
            for(int i=end_col-1; i>=start_col;i--){
                ans[end_row][i] = value++;
              }
            }
            if(start_row<=end_row){
            for(int i=end_row-1; i>start_row;i--){
                ans[i][start_col] = value++;
              }
            }
            start_col++;
            start_row++;
            end_col--;
            end_row--;
        }
        return ans;
    }
}