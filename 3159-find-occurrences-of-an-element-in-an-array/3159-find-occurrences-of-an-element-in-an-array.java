class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> idx = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == x)
                idx.add(i);
        }

        int res[] = new int[queries.length];
        for(int j = 0 ; j < queries.length; j++){
            int k = queries[j];
            if(k <= idx.size())
                res[j] = idx.get(k-1);
            else
                res[j] = -1;
        }
        return res;
    }
}