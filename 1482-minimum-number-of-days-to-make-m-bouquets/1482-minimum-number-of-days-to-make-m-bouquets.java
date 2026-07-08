class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int b : bloomDay){
            low = Math.min(low, b);
            high = Math.max(high, b);
        }

        int ans = -1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(canMake(bloomDay, mid, m, k)){
                ans =  mid;
                high = mid-1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }

    private boolean canMake(int[] bloomDay, int bloom,int m, int k){
        int count = 0;
        int bouquet = 0;
        for(int b : bloomDay){
            if(b <= bloom){
                count++;
                if(count >= k){
                    bouquet++;
                    count = 0;
                }
            }
            else
                count = 0;
        }
        return bouquet >= m;
    }
}