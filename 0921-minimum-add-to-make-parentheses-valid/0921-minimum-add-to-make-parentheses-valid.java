class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int close = 0;

        for(char c : s.toCharArray()){
            if(c == '(') 
                stack.push(c);
            else{
                if(!stack.isEmpty())
                    stack.pop();
                else
                    close++;
            }
        }
        return stack.size() + close;
    }
}