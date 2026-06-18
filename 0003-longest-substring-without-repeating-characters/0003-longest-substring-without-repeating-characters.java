class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0, r = 0;
        int maxLength = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(r = 0 ; r < s.length(); r++){
            if(hm.containsKey(s.charAt(r))){
                maxLength = Math.max(maxLength, r-l);
                l = Math.max(l, hm.get(s.charAt(r)) + 1);
            }
            hm.put(s.charAt(r), r);
        }
        maxLength = Math.max(maxLength, r-l);
        return maxLength;
    }
}