class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            int len = sb.length();
            if(len > 0 && sb.charAt(len-1) == 'A' && s.charAt(i) == 'B')
                sb.deleteCharAt(len-1);
            
            else if(len > 0 && sb.charAt(len-1) == 'C' && s.charAt(i) == 'D')
                sb.deleteCharAt(len-1);

            else
                sb.append(s.charAt(i));
        }
        return sb.length();
    }
}