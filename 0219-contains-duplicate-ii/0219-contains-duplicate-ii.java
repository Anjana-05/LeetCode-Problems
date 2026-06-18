class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int r = 0 ; r < nums.length; r++){
            if(r - l > k){
                hs.remove(nums[l]);
                l++;
            }
            if(hs.contains(nums[r]))
                return true;
            hs.add(nums[r]);
        }
        return false;
    }
}