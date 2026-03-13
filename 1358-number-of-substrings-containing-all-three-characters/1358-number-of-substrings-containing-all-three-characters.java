class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int n = s.length();
        int hash[] = new int[3];
        Arrays.fill(hash,-1);
        int min = 0;
        for(int i = 0 ; i < n ; i++){
            int c = s.charAt(i) - 'a';
            hash[c] = i;
            min = Math.min(hash[0], hash[1]);
            min = Math.min(min, hash[2]);
            if(hash[0] != -1 && hash[1] != -1 && hash[2] != -1){
                count = count + min + 1;
            }
        }
        return count;
    }
}