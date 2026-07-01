class Solution {
    public int foundOrNot(int[][] matrix, int row, int target){
        int low = 0, high = matrix[0].length-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(matrix[row][mid] == target)
                return 1;
            else if(matrix[row][mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return 0;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length-1;
        int res = 0;
        for(int i = 0 ; i < matrix.length; i++){
            if(matrix[i][col] >= target){
                res = foundOrNot(matrix, i, target);
                break;
            }
        }
        return res == 1 ? true : false;
    }
}