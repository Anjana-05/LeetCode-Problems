class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = Integer.MIN_VALUE;
        int ans = 0;
        for(int p : position){
            high = Math.max(p, high);
        }

        while(low <= high){
            int mid = low + (high-low)/2;

            if(canFillBucket(position, mid, m)){
                ans = mid;
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return ans;
    }

    private boolean canFillBucket(int[] position, int dist, int balls){
        int lastIndex = position[0];
        int count = 1;

        for(int i = 1; i < position.length; i++){
            if(position[i] - lastIndex >= dist){
                count++;
                lastIndex = position[i];
            }
        }
        return count >= balls;
    }
}