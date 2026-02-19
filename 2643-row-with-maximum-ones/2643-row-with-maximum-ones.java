class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] rowsum = new int[mat.length];
        int maxiOnes[] = new int[2];
        for(int i = 0 ; i < mat.length ; i++){
            int sum =0;
            for(int j = 0 ; j < mat[0].length; j++){
                sum += mat[i][j];
            }
            if(sum > maxiOnes[1]){
                maxiOnes[0] = i;
                maxiOnes[1] = sum;
            }
        }

        return maxiOnes;
    }
}