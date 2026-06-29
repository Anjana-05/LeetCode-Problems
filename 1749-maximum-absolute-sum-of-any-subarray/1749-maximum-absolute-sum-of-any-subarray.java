class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int cMax = 0, cMin = 0;
        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            cMax += nums[i];
            maxSum = Math.max(cMax, maxSum);
            if(cMax < 0)
                cMax = 0;

            cMin += nums[i];
            minSum = Math.min(cMin, minSum);
            if(cMin > 0)
                cMin = 0;
        }
        return Math.max(Math.abs(minSum), maxSum);
    }
}