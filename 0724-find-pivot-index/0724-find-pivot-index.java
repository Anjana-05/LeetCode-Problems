class Solution {
    public int pivotIndex(int[] nums) {
        int size = nums.length-1;

        for(int i = 1 ; i <= size ; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        int ls = 0, rs = nums[size];

        for(int i = 0 ; i <= size; i++){
            if(i == size && ls == 0) return i;
            if(ls == (rs-nums[i]))
                return i;
            ls = nums[i];
        }
        return -1;
    }
}