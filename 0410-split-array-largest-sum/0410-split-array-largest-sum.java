class Solution {
    public int splitArray(int[] nums, int k) {
        if(nums.length < k) return -1;
        int low = Integer.MIN_VALUE;
        int high = 0;

        for(int n :nums){
            low = Math.max(low, n);
            high += n;
        }

        int ans = -1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(canSplit(nums, mid, k)){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }

    private boolean canSplit(int[] nums, int limit, int k){
        int sum = 0;
        int subarray = 1;

        for(int n : nums){
            if(sum + n > limit){
                subarray++;
                sum = 0;
            }
            sum += n;
        }
        return subarray <= k;
    }
}