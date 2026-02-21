class Solution {
    public String removeOuterParentheses(String s) {
        String res = "";
        int counter = 0;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '(' && ++counter > 1)
                res += s.charAt(i);
            else if(s.charAt(i) == ')' && --counter > 0)
                res += s.charAt(i);
        }
        return res;
    }
}