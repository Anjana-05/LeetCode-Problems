class Solution {
    public String intToRoman(int num) {
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        String res = "";
        int i =0;
        while(num > 0){
            while(num >= nums[i]){
                res += roman[i];
                num -= nums[i]; 
            }
            i++;
        }
        return res;
    }
}