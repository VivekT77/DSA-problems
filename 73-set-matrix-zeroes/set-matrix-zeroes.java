class Solution {
    public void setZeroes(int[][] matrix) {

        boolean [] is_row_zero = new boolean[matrix.length];
        boolean [] is_col_zero = new boolean[matrix[0].length];

        for(int i=0;i<matrix.length;i++){       //first iterate over the matrix & whereever "0" is obtained
            for(int j=0;j<matrix[0].length;j++){    //mark that row,col as true and for marking 2 boolean 
                if(matrix[i][j] == 0){          //arrays are declared
                    is_row_zero[i] = true;
                    is_col_zero[j] = true;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){         //now again iterate and if the particular row or col mark
            for(int j=0;j<matrix[0].length;j++){    //as true is found then set the matrix[i][j] as "0"
                if( is_row_zero[i] || is_col_zero[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}