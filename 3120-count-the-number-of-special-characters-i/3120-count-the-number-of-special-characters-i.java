class Solution {
    public int numberOfSpecialChars(String word) {
        int[] freq = new int[256];
        int count = 0;
        for(int i = 0 ; i < word.length(); i++){
            freq[word.charAt(i)]++;
        }

        for(int i = 0 ; i < 256 ; i++){
            if(freq[i] >= 1 && freq[i+32] >= 1)
                count++;
        }
        
        return count;
    }
}