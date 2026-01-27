class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int c = 0, mc =0 ;
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i+1] == nums[i]) continue;
            if(nums[i+1] - nums[i] == 1 ){
                c++;
                if(c > mc)
                    mc = c;
            }
            else
                c =0;
        }
        return mc+1;
    }
}