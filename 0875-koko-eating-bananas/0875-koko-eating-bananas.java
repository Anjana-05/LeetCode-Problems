class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int low = 1, res =0;
     int high = Integer.MIN_VALUE;
     for(int p : piles){
        high = Math.max(high, p);
     }   

     while(low <= high){
        int mid = low + (high-low) / 2;

        if(canFinish(piles, mid) <= h){
            res = mid;
            high = mid-1;
        }
        else
            low = mid+1;
     }
     return res;

    }

    private long canFinish(int[] piles, int k){
        long hours = 0;
        for(int p : piles){
            hours += (p+k-1)/k;
        }
        return hours;
    }
}