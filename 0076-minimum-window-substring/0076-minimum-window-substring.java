class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        if(s.equals(t)) return s;

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0 ; i < t.length() ; i++){
            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i),0)+1);
        }

        int minWindowSize = Integer.MAX_VALUE;
        int start = -1, count = 0;

        int l = 0, r = 0;
        while(r < s.length()){
            char ch = s.charAt(r);
            hm.put(ch, hm.getOrDefault(ch,0)-1);

            if(hm.get(ch) >= 0)
                count++;
            while(count == t.length()){
                if((r-l+1) < minWindowSize){
                    minWindowSize = (r-l+1);
                    start = l;
                }
                ch = s.charAt(l);
                hm.put(ch, hm.get(ch)+1);
                if(hm.get(ch) > 0) count--;

                l++;
            }
            r++;
        }

        if(start == -1) return "";
        
        return s.substring(start, start+minWindowSize);
    }
}