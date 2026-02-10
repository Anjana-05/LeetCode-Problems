class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        int n = nums.length; 
        for(int i = 0 ; i < n-1 ; i++){
            Set<Integer> temp = new HashSet<>();
            for(int j = i+1; j < n; j++){
                int third = - (nums[i] + nums[j]);
                    if(temp.contains(third)){
                        List<Integer> ans = Arrays.asList(nums[i],nums[j], third);
                        Collections.sort(ans);
                        s.add(ans);
                     }
                    temp.add(nums[j]);
                }
            }
        res.addAll(s);
        return res;
    }
}