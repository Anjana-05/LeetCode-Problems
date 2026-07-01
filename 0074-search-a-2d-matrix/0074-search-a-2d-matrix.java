class Solution {
    public boolean foundOrNot(int[][] matrix, int row, int target){
        int low = 0, high = matrix[0].length-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(matrix[row][mid] == target)
                return true;
            else if(matrix[row][mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length-1;
        int row = -1;
        int low = 0, high = matrix.length-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(matrix[mid][col] >= target){
                row = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        if(row == -1)
            return false;
        return foundOrNot(matrix, row, target);
    }
}