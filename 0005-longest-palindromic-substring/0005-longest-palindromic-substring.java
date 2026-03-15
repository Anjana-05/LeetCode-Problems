class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int l,r;
        int res = 0;
        for(int i =  0; i < s.length() ; i++){
            l = i; r = i;
            while((l >= 0 && r < s.length()) && (s.charAt(l) == s.charAt(r))){
                if(r-l+1 > res){
                    start = l;
                    res = r-l+1;
                }
                l--; r++;
            }

            l = i; r = i+1;
            while((l >= 0 && r < s.length()) && s.charAt(l) == s.charAt(r)){
                if(r-l+1 > res){
                    start = l;
                    res = r-l+1;
                }
                l--; r++; 
            }
        }

        return s.substring(start,start+res);
    }
}