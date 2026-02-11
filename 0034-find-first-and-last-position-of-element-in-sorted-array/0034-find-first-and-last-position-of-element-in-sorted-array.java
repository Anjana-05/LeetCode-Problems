class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int n = nums.length-1;
        res[0] = firstFind(nums,n, target);
        res[1] = lastFind(nums,n,target);
        return res;
    }

    public int firstFind(int[] nums, int n, int target){
        int low = 0, high = n;
        int pos = -1;
        while(low <= high){
            int mid = (low+high) /2;
            if(nums[mid] == target){
                pos = mid;
                high = mid-1; 
            }
            else if(nums[mid] > target)
                high = mid-1;
            else
                low = mid+1;
        }
        return pos;
    }

    public int lastFind(int[] nums, int n, int target){
        int low = 0, high = n;
        int pos = -1;
        while(low <= high){
            int mid = (low+high) /2;
            if(nums[mid] == target){
                pos = mid;
                low = mid+1; 
            }
            else if(nums[mid] > target)
                high = mid-1;
            else
                low = mid+1;
        }
        return pos;
    }
}