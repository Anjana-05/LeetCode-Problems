class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length -1;
        for(int i = 0 ; i < matrix.length; i++){
            if(matrix[i][0] <= target && matrix[i][col] >= target){
                int low = 0;
                int high = col;
                while(low <= high){
                    int mid = (low + high) /2;
                    if(matrix[i][mid] == target)
                        return true;
                    
                    else if(matrix[i][mid] > target)
                        high = mid-1;
                    
                    else
                        low = mid+1;
                }
            }
        }
        return false;
    }
}