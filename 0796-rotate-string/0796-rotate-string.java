class Solution {
    public boolean rotateString(String s, String goal) {
        String rotated = "";

        for(int i = 0 ; i < s.length() ; i++){
            rotated = s.substring(i) + s.substring(0,i);
            if(rotated.equals(goal))
                return true;
        }
        return false;
    }
}