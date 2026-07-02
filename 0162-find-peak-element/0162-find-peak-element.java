class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length < 2) return 0;
        if(nums.length == 2) return nums[0]>nums[1] ? 0 : 1;
        int low = 0, mid = 1, high = 2;
        while(high < nums.length){
            if(nums[low] < nums[mid] && nums[mid] > nums[high])
                return mid;
            low++;
            mid++;
            high++;
        }
        return nums[mid-1] < nums[high-1] ? high-1 : 0;
    }
}