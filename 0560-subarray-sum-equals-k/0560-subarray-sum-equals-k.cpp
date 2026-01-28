class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> mp;
        int prefix_Sum =0 , cnt = 0;

        mp.insert({0,1});
        for(int i= 0 ; i < nums.size() ; i++){
            prefix_Sum += nums[i];
            int remove = prefix_Sum - k;
            cnt += mp[remove];
            mp[prefix_Sum] += 1;
        }
        return cnt;
    }
};