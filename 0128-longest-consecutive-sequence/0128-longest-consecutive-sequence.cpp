class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size() == 0) return 0;
        int longest;
        unordered_set<int> set;
        for(int i = 0 ; i < nums.size() ; i++){
            set.insert(nums[i]);
        }

        for(int it : set){
            if(set.find(it-1) == set.end()){
                int c = 1;
                int x = it+1;
                while(set.find(x) != set.end()){
                    c++;
                    x++;
                }
                longest = max(longest, c);
            }
        }
        return longest;
    }
};