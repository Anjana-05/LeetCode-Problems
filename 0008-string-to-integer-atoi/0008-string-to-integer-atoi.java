class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;
        int index = (s.charAt(0) == '-' || s.charAt(0) == '+') ? 1 : 0;
        int sign = (s.charAt(0) == '-') ? -1 : 1;
        long res = 0;
        while(index < s.length() && s.charAt(index) == '0'){
            index++;
        }
        while(index < s.length()){
            char c = s.charAt(index);
            if(Character.isDigit(c))
                res  = res * 10 + (c - '0');
            else
                break;
            index++;
            if(res * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else if(res * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE; 
        }

        return (int)res * sign;
    }
}