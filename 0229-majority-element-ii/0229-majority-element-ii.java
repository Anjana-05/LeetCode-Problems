class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        int c1 = 0, c2 =0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(c1 == 0 && ele2 != nums[i]){
                ele1 = nums[i];
                c1++;
            }
            else if(c2 == 0 && ele1 != nums[i]){
                ele2 = nums[i];
                c2++;
            }
            else if(ele1 == nums[i]) c1++;
            else if(ele2 == nums[i]) c2++;
            else{
                c1--;
                c2--;
            }
        }

        int min = n / 3;
        c1 = 0; c2 = 0;
        for(int j = 0; j < n ; j++){
            if(ele1 == nums[j]) c1++;
            if(ele2 == nums[j]) c2++;
        }

        if(c1 > min) res.add(ele1);
        if(c2 > min) res.add(ele2);

        return res;
    }
}

