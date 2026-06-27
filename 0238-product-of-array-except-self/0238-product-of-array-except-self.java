class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lprod = new int[nums.length];
        int[] rprod = new int[nums.length];
        lprod[0] = 1;
        rprod[nums.length-1] = 1;

        for(int i = 1; i < nums.length; i++)
            lprod[i] = nums[i-1] * lprod[i-1];

        for(int i = nums.length-2; i >= 0; i--)
            rprod[i] = nums[i+1] * rprod[i+1];
        
        for(int i = 0 ; i < nums.length; i++)
            nums[i] = lprod[i] * rprod[i];

        return nums;
    }
}