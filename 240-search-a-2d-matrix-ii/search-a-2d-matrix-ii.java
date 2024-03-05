class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
//if we start from (0,0) then we will not be sure whether start for row-wise or col-wise ,so start
// from right corner like 15 from example 1     
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }
}