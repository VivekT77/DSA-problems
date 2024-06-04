class Solution {
    public int findmax(int[][]mat,int m,int column){ //column is taken to find max element in that segment
        int maxvalue=0;
        int index=0;
        for(int i=0;i<m;i++){
            if(mat[i][column] > maxvalue){
                maxvalue=mat[i][column];
                index=i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int m= mat.length;
        int n= mat[0].length;
        int low =0;
        int high=n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int maxelmt = findmax(mat,m,mid); //mid will act as column for above function call
             //condition for moving left and right and boundary as -1
            int left = mid-1>=0 ? mat[maxelmt][mid-1]:-1; 
            int right = mid+1<n ? mat[maxelmt][mid+1]:-1;
            //Normal BS
            if(mat[maxelmt][mid]>left && mat[maxelmt][mid]>right){ 
                return new int[]{maxelmt,mid};
            }else if(mat[maxelmt][mid]<left){ 
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}