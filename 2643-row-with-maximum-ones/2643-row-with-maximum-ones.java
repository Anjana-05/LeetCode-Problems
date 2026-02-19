class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] rowsum = new int[mat.length];
        int maxiOnes[] = new int[2];
        int maxsum=0;
        for(int i = 0 ; i < mat.length ; i++){
            int sum =0;
            for(int j = 0 ; j < mat[0].length; j++){
                sum += mat[i][j];
            }
            rowsum[i] = sum;
        }

        for(int k = 0 ; k < mat.length; k++){
            if(rowsum[k] > maxiOnes[1]){
                maxiOnes[0] = k;
                maxiOnes[1] = rowsum[k];
            }
        }
        return maxiOnes;
    }
}