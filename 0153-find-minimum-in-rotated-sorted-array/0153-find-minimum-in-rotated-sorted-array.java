class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length-1;
        int minNum = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low) /2;
            minNum = Math.min(nums[mid], minNum);

            if(nums[mid] > nums[high])
                low = mid+1;
            else
                high = mid -1;
        }
        return minNum;
    }
}