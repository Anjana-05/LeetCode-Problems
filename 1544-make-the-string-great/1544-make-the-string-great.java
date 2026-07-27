class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            int len = sb.length();

            if(len > 0 && Character.toLowerCase(sb.charAt(len-1)) == Character.toLowerCase(s.charAt(i)) && sb.charAt(len-1) != s.charAt(i)){
                sb.deleteCharAt(len-1);
            }
            else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}