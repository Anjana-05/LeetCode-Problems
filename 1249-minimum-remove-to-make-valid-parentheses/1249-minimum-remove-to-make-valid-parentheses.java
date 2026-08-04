class Solution {
    public String minRemoveToMakeValid(String s) {
        int open = 0, close = 0;

        StringBuilder first = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                first.append(ch);
                open++;
            } else if (ch == ')') {
                if (open > 0) {
                    first.append(ch);
                    open--;
                }
            } else
                first.append(ch);
        }

        StringBuilder ans = new StringBuilder();

        for (int i = first.length() - 1; i >= 0; i--) {
            char ch = first.charAt(i);
            if (ch == ')') {
                ans.append(ch);
                close++;
            } else if (ch == '(') {
                if (close > 0) {
                    ans.append(ch);
                    close--;
                }
            } else
                ans.append(ch);
        }
        return ans.reverse().toString();
    }
}