class Solution {
    public int myAtoi(String s) {
        int res = 0, sign = 1, index = 0;
        s = s.trim();
        if(s.length() == 0)
            return 0;
        if(s.charAt(0) == '-'){
            sign = -1;
            index++;
        }else if(s.charAt(0) == '+'){
            sign = 1;
            index++;
        }
        while(index < s.length() && s.charAt(index) == '0')
            index++;
        while(index < s.length()){
            if(s.charAt(index) < '0' ||  s.charAt(index) > '9')
                return sign*res;
            int digit = s.charAt(index) - '0';
            if(res > Integer.MAX_VALUE / 10|| ( res == Integer.MAX_VALUE / 10 && digit > 7))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + digit;
            index++;
        }
        
        return sign * res;
    }
}