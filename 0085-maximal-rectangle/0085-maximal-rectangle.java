class Solution {
    public int maximalRectangle(char[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int maxArea = 0;
        int[] height = new int[c];
        for(int i = 0 ; i < r; i++){
            for(int j = 0;j < c ; j++){
                if(matrix[i][j] == '1')
                    height[j] += 1;
                else
                    height[j] = 0;
            }
            maxArea = Math.max(maxArea, findLargestArea(height, c));
        }

        return maxArea;

    }
    private int findLargestArea(int[] height, int n){
        int maxArea = Integer.MIN_VALUE;
        Deque<Integer> stack = new ArrayDeque<>();
         for(int i = 0; i <= n ; i++){
                int h = i == n ? 0 : height[i];
                while(!stack.isEmpty() && h < height[stack.peek()]){
                    int heights = height[stack.pop()];
                    int width = stack.isEmpty() ? i : i - stack.peek() -1;
                    maxArea = Math.max(maxArea, heights*width);
                }
                stack.push(i);
            }
        return maxArea;
    }
}