class Solution {
    public int findMaxInRow(int[][] mat, int col, int n) {
        int maxIndex = -1;
        int max = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][col] > max){
                maxIndex = i;
                max = mat[i][col];
            }
        }
        return maxIndex;
    }

    public int[] findPeakGrid(int[][] mat) {
        int low = 0, high = mat[0].length-1;

        while(low <= high){
            int mid = (low + high) /2;
            int rowIndex = findMaxInRow(mat, mid, mat.length);
            int left = mid-1 >= 0 ? mat[rowIndex][mid-1] : -1;
            int right = mid+1 <= mat[0].length-1 ? mat[rowIndex][mid+1] : -1;

            if(left < mat[rowIndex][mid] && right < mat[rowIndex][mid])
                return new int[]{rowIndex,mid};
            else if(mat[rowIndex][mid] < right)
                low = mid + 1;
            else
                high = mid-1;
        }
    return new int[]{-1,-1};
    }
}