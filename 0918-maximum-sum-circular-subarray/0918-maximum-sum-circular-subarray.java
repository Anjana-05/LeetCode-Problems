class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length == 1) return nums[0];
        int cms = 0, cmins = 0,totalSum = 0;
        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
            cms += nums[i];
            cmins += nums[i];
            minSum = Math.min(cmins, minSum);
            maxSum = Math.max(cms, maxSum);
            if(cms < 0)
                cms = 0;
            if(cmins > 0)
                cmins = 0;

        }
        if(totalSum == minSum) return maxSum;
        return Math.max(maxSum, totalSum - minSum);
    }
}