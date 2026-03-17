class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int c = capacity;
        int steps =0;
        for(int i = 0 ; i < plants.length ; i++){
            if(c >= plants[i]){
                steps++;
                c -= plants[i];
            }
            else{
                c = capacity;
                steps = steps + i + (i+1);
                c -= plants[i];
            }
        }
        return steps;
    }
}