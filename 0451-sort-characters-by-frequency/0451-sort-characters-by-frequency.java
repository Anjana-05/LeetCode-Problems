class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(hm.entrySet());

        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Character,Integer> entry : list){
            char ch = entry.getKey();
            int freq = entry.getValue();

            for(int i = 0; i < freq; i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}