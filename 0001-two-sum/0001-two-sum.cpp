class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
         int n = nums.size();
        vector<int> res(2);
        unordered_map<int,int> m;

        for(int i = 0 ; i < n ; i++){
            if(m.contains(target-nums[i])){
                res[0] = i;
                res[1] = m[target-nums[i]];
                return res;
            }
            else{
                m[nums[i]] = i;
            }
        }
        return {};
    }
};