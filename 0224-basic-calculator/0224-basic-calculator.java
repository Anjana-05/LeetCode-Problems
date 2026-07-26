class Solution {
    public int calculate(String s) {
        int sign = 1;
        int curr = 0;
        int ans = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int num = s.charAt(i)-'0';
                while(i+1 < s.length() && Character.isDigit(s.charAt(i+1)) ){
                    num = num * 10 + s.charAt(i+1) - '0';
                    i++;
                }
                curr = num * sign;
                ans += curr;
                curr = 0;
                sign = 1;    
            }

            else if( s.charAt(i) == '+')
                sign = 1;
            else if ( s.charAt(i) == '-')
                sign = -1;
            
            else if(s.charAt(i) == '('){
                stack.push(ans);
                stack.push(sign);
                ans = 0;
                sign = 1;
            }
            else if(s.charAt(i) == ')'){
                int prevSign = stack.pop();
                ans = ans * prevSign;
                ans += stack.pop();
            }
        }
        return ans;
    }
}