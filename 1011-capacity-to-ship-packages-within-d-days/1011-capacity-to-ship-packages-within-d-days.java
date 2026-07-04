class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = Integer.MIN_VALUE, high = 0;
        for(int w : weights){
            low = Math.max(low, w);
            high += w;
        }
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low )/2;

            if(canPack(weights, days, mid)){
                ans = mid;
                high = mid -1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }

    private boolean canPack(int[] weights, int days, int mid){
        int sum =0, c = 1;
        for(int i = 0 ; i < weights.length;  i++){
            if(sum+weights[i] >  mid){
                c++;
                sum =0;
            }
            sum += weights[i];

        }
        return c <= days;
    }
}