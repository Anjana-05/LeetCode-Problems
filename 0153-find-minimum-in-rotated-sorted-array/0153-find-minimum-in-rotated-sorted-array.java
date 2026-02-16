class Solution {
    public int findMin(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int low = 0, high = nums.length-1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[low] <= nums[mid]){
                mini = Math.min(nums[low], mini);
                low = mid + 1;
            }
            else{
                mini = Math.min(nums[mid],mini);
                high = mid - 1;
            }
        }
        return mini;
    }
}