class Solution {
public:
    void sortColors(vector<int>& nums) {
        int temp = 0,i = 0, j =0;
        for(i = 1 ;  i < nums.size() ; i++){
            temp = nums[i];
            for(j = i-1 ;  j >= 0; j--){
                if(temp < nums[j])
                    nums[j+1] = nums[j];
                else
                    break;
            }
            nums[j+1] = temp;
        }
    }
};