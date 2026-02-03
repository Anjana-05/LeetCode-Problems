class Solution {
public:
    string longestPalindrome(string s) {
        int start = 0, l = 0, r= 0;
        int res=0;
        for(int i = 0 ; i < s.size(); i++){
            l = i, r = i;
            while(l >= 0 && r < s.size() && s[l] == s[r]){
                if((r-l+1) > res){
                    start = l;
                    res = r-l+1;
                }
                l--; r++;
            }

            l = i, r = i+1;
            while(l >= 0 && r < s.size() && s[l] == s[r]){
                if((r-l+1) > res){
                    start = l;
                    res = r-l+1;
                }
                l--; r++;
            }
        }
        return s.substr(start,res);
    }
};