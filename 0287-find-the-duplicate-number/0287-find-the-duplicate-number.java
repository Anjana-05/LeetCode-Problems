class Solution {
    public int findDuplicate(int[] nums) {
        int freq[] = new int[nums.length];

        for(int num : nums){
            if(freq[num]++ > 1)
                return num;
            else
                freq[num]++;
        }
        return -1;
    }
}