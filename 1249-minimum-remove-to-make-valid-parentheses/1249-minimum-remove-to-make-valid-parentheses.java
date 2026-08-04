class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i = 0 ; i < s.length() ; i++){
            if(ch[i] == '(')
                stack.push(i);
            else if(ch[i] == ')'){
                if(!stack.isEmpty())
                    stack.pop();
                else
                    ch[i] = '#';
            }
        }

        while(!stack.isEmpty())
            ch[stack.pop()] = '#';

        StringBuilder sb = new StringBuilder();
        for(char c : ch){
            if(c != '#')
                sb.append(c);
        }
        return sb.toString();
    }
}