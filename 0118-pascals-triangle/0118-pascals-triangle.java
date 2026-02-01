class Solution {
    public List<Integer> generator(int r){
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        int temp = 1;
        for(int i = 1 ; i < r; i++){
            temp = temp * (r-i);
            temp = temp / i;
            ans.add(temp);
        }
        return ans;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 1 ; i <= numRows ; i++){
            res.add(generator(i));
        }
        return res;
    }
}