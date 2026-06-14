class Solution {
    public String mergeAlternately(String word1, String word2) {
        String mergedString = "";
        int i = 0;
        while(i < word1.length() && i < word2.length()){
            mergedString += word1.charAt(i);
            mergedString += word2.charAt(i);
            i++;
        }

        while(i < word1.length()){
            mergedString += word1.charAt(i);
            i++;
        }

        while(i < word2.length()){
            mergedString += word2.charAt(i);
            i++;
        }

        return mergedString;
    }
}