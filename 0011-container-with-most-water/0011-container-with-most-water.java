class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maximumArea = Integer.MIN_VALUE;
        while(left < right){
            maximumArea = Math.max(maximumArea, (right-left)*Math.min(height[left], height[right]));
            if(height[left] <= height[right])
                left++;
            else
                right--;
        }
        return maximumArea;
    }
}