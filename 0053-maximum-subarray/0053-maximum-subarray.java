class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length <= 1) return nums[0];
        int cs = 0, maxsum = Integer.MIN_VALUE;

        for(int n : nums){
            cs += n;
            maxsum = Math.max(cs, maxsum);

            if(cs < 0)
                cs = 0;
        }
        return maxsum;
    }
}