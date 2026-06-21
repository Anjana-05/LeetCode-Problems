class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        int l =0, r = 0;


        if(s1.length() > s2.length())
            return false;

        for(int i = 0 ; i < s1.length() ; i++){
            freq1[s1.charAt(i)-'a']++;
        }

        for(r = 0 ; r < s2.length() ; r++){
            freq2[s2.charAt(r)-'a']++;

            if((r-l+1) > s1.length()){
                freq2[s2.charAt(l)-'a']--;
                l++;
            }

            if((r-l+1) == s1.length()){
                boolean flag = true;
                for(int i = 0; i < 26 ; i++){
                    if(freq1[i] != freq2[i]){
                        flag = false;
                        break;
                    }
                }

                if(flag) return true;
            }
        }
        return false;
    }
}