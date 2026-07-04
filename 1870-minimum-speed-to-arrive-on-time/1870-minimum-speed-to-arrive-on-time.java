class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low = 1, high = (int)1e7;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(canReach(dist, mid, hour)){
                res = mid;
                high= mid-1;
            }
            else
                low = mid + 1;
        }
        return res;
    }

    private boolean canReach(int[] dis, int speed, double hours){
        double time = 0.0;
        for(int i = 0 ; i < dis.length; i++){
            double t = (double) dis[i] / speed;

            if(i != dis.length-1)
                time += Math.ceil(t);
            else
                time += t;
        }
        return time <= hours;
    }
}