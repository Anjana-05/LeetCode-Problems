class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0 ; i < asteroids.length; i++){
            while( !stack.isEmpty() && stack.peek() > 0 && asteroids[i] < 0 && stack.peek() < -asteroids[i])
                stack.pop();

            if(!stack.isEmpty() && stack.peek() > 0 && asteroids[i] < 0){
                if(stack.peek() == -asteroids[i])
                    stack.pop();
            }

            else
                stack.push(asteroids[i]);
        }
        int[] res = new int[stack.size()];
        for(int i = stack.size()-1; i >=0 ; i--){
            res[i] = stack.pop();
        }
        return res;
    }
}