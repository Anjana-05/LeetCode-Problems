class Solution {
    public int majorityElement(int[] nums) {
        int ele = nums[0], cnt = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(ele == nums[i])
                cnt++;
            else
                cnt--;
            if(cnt < 0){
                cnt = 0;
                ele = nums[i];
            }
        }
        return ele;
    }
}