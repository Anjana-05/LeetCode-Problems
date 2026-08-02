class CustomStack {
    int[] stack;
    int maxSize;
    int index;
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        this.maxSize = maxSize;
        index = -1;
    }
    
    public void push(int x) {
        if(index == maxSize-1) return;
        stack[++index] = x;
    }
    
    public int pop() {
        if(index == -1) return -1;
        return stack[index--];
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k, index+1);
        for(int i = 0 ; i < limit; i++)
            stack[i] += val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */