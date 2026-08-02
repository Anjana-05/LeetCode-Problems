class MinStack {
    Stack<Long> stack;
    long minStack;
    public MinStack() {
        stack =  new Stack<>();
        minStack  = Long.MAX_VALUE;
    }
    
    public void push(int value) {
        long val = (long)value;
        if(stack.isEmpty()){
            stack.push(val);
            minStack = val;
        }
        else{
            if(val < minStack){
                long x = 2 * val - minStack;
                minStack = val;
                stack.push(x);
            }else
                stack.push(val);
        }
    }
    
    public void pop() {
        if(stack.peek() < minStack){
            minStack = 2 * minStack - stack.peek();
            stack.pop();
        }
        else
            stack.pop();
    }
    
    public int top() {
        long x = stack.peek();
        return x < minStack ? (int)minStack : (int)x;
    }
    
    public int getMin() {
        return (int)minStack;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */