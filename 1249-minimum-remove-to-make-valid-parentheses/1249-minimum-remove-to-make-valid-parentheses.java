class Solution {
    public String minRemoveToMakeValid(String s) {
        int open = 0, close = 0;
        char[] ch = s.toCharArray();        

        for(int i = 0; i < ch.length; i++){
            char c = ch[i];
            if (c == '(') 
                open++;
            else if (c == ')') {
                if (open > 0) 
                    open--;
                else
                    ch[i] = '#';
            } 
        }

        for(int i = ch.length-1; i >= 0; i--){
            char c = ch[i];
            if (c == ')') 
                close++;
            else if (c == '(') {
                if (close > 0) 
                    close--;
                else
                    ch[i] = '#';
            } 
        }

        StringBuilder ans = new StringBuilder();

        for(char c : ch){
            if(c != '#')
                ans.append(c);
        }
        return ans.toString();
    }
}