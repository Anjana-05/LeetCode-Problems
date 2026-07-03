class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int firstOccurence = -1;
        int lastOccurence = -1;
        while(left <= right){
            int mid = left + (right- left)/2;
            if(nums[mid] == target){
                firstOccurence = mid;
                right = mid-1;
            }

            else if(nums[mid] > target)
                right = mid-1;
            else
                left = mid + 1;
        }


        if(nums.length == 0 || firstOccurence == -1) return new int[]{firstOccurence, lastOccurence};
        left = firstOccurence;
        right = nums.length-1;
        while(left <= right){
            int mid = left + (right- left)/2;
            if(nums[mid] == target){
                lastOccurence = mid;
                left = mid + 1;
            }

            else if(nums[mid] > target)
                right = mid-1;
            else
                left = mid + 1;
        }
        return new int[]{firstOccurence, lastOccurence};
    }
}