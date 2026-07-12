class Solution {
    public int countSubstrings(String s) {
        int res = 0;

        for(int i = 0 ; i < s.length(); i++){
            int left=  isPalindrome(s, i, i);
            int right = isPalindrome(s, i , i+1);

            res += left + right;
        }
        return res;
    }

    private int isPalindrome(String s, int l, int r){
        int count = 0;
        while((l >= 0 && r < s.length()) && (s.charAt(l) == s.charAt(r))){
            count++;
            l--;
            r++;
        }
        return count;
    }
}