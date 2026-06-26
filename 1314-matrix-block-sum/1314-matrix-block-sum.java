class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] ans = new int[mat.length][mat[0].length];

        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0; j < mat[0].length ; j++){
                int sum = 0;
                for(int r = i-k ; r <= i+k ; r++){
                    for(int c = j-k; c <= j+k; c++){
                        if((r >= 0 && r < mat.length) && (c >= 0 && c < mat[0].length)){
                            sum += mat[r][c];
                        }
                    }
                    ans[i][j] = sum;

                }
            }
        }
        return ans;
    }
}