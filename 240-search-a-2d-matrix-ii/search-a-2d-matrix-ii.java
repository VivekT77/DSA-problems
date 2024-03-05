class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
//if we start from (0,0) then we will not be sure whether start for row-wise or col-wise ,so start
// from right corner like 15 from example 1     
        int row =0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }else if(matrix[row][col] < target) {
                 row++;
            }else{ 
                col--;
            }
        }
        return false;
    }
}