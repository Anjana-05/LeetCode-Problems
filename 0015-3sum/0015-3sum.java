class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i < n-2; i++){
            int left = i+1;
            int right = n-1;
            if(i > 0 && nums[i] == nums[i-1]) 
                continue;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0)
                    right--;
                else if(sum < 0)    
                    left++;
                else{
                   res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                   left++; 
                   right--;
                   while(nums[left] == nums[left-1] && left < n-1) left++;
                   while(nums[right] == nums[right+1] && right > 0) right--;
                }
            }
        }
        return res;
    }
}