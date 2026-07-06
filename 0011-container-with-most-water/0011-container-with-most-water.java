class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxiArea = Integer.MIN_VALUE;
        int currentArea = 0;
        while(left < right){
           currentArea = Math.min(height[left], height[right]) * (right-left);
           maxiArea = Math.max(maxiArea, currentArea);

           if(height[left] < height[right])
                left++;
            else
                right--; 
        }

        return  maxiArea;
    }
}