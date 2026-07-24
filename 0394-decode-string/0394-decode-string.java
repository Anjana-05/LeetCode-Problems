class Solution {
    public String decodeString(String s) {
       Deque<Character> stack = new ArrayDeque<>();

       for(int i = 0 ; i < s.length() ; i++){

        if(s.charAt(i) != ']')
            stack.push(s.charAt(i));

        else{
            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty() && stack.peek() != '[')
                sb.insert(0, stack.pop());
            
            stack.pop();
            
            StringBuilder num = new StringBuilder();
            while(!stack.isEmpty() && Character.isDigit(stack.peek()))
                num.insert(0, stack.pop());

            int repeat = Integer.parseInt(num.toString());

            StringBuilder repeated = new StringBuilder();
            for(int j = 0 ; j < repeat; j++)
                repeated.insert(0,sb);

            for(char c : repeated.toString().toCharArray())
                stack.push(c);
        }
       }

       StringBuilder res= new StringBuilder();
       while(!stack.isEmpty())
            res.insert(0,stack.pop()); 

        return res.toString();
    }
}