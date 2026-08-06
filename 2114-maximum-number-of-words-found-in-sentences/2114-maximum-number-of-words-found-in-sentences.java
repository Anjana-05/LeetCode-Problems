class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < sentences.length ; i++){
            String[] words = sentences[i].split(" ");
            max = Math.max(max, words.length);
        }
        return max;
    }
}