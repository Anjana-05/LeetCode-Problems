class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l =0 , r = 0;

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0 ; i < s1.length() ; i++){
            hm.put(s1.charAt(i) , hm.getOrDefault(s1.charAt(i),0)+1);
        }

        int count = s1.length();

        while(r < s2.length()){
            
            int val = hm.getOrDefault(s2.charAt(r),0);
            if(val > 0) count--;
            hm.put(s2.charAt(r), val-1);

            if(count == 0) return true;

            if((r-l+1) == s1.length()){
                if(hm.get(s2.charAt(l)) >= 0) count++;
                hm.put(s2.charAt(l), hm.get(s2.charAt(l))+1);
                l++;
            }

            r++;
        }
        return false;
    }
}