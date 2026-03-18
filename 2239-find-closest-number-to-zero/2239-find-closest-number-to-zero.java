class Solution {
    public int findClosestNumber(int[] nums) {
        int mindist = Integer.MAX_VALUE;
        int closest = 0;
        for(int i = 0 ; i < nums.length; i++){
            int abs = (nums[i] < 0) ? -nums[i] : nums[i];
            if(abs < mindist || (abs == mindist && abs > closest)){
                mindist = abs;
                closest = nums[i];
            }
        }
        return closest;
    }
}