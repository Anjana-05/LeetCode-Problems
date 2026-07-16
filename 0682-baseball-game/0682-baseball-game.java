class Solution {
    public int calPoints(String[] operations) {
        int res = 0;

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i =0; i < operations.length; i++){
            String s = operations[i];

            if(s.equals("C")){
                if(stack.isEmpty()) break;
                stack.pop();
            }

            else if(s.equals("D")){
                if(stack.isEmpty()) break;
                stack.push(stack.peek() * 2);
            }

            else if(s.equals("+")){
                if(stack.isEmpty()) break;
                int a = stack.pop();
                int sum = a + stack.peek();
                stack.push(a);
                stack.push(sum);
            }

            else
                stack.push(Integer.parseInt(s));
        }

        while(!stack.isEmpty())
            res += stack.pop();
        
        return res;
    }
}