class Solution {
    public int maxProduct(int[] nums) {
        int prefixProd1 = 1, prefixProd2 = 1;
        int maxProd = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            prefixProd1 *= nums[i];
            maxProd = Math.max(maxProd, prefixProd1);
            if(prefixProd1 == 0)
                prefixProd1 = 1;
        }

        for(int i = nums.length-1 ; i >= 0 ; i--){
            prefixProd2 *= nums[i];
            maxProd = Math.max(maxProd, prefixProd2);
            if(prefixProd2 == 0)
                prefixProd2 = 1;
        }

        return maxProd;
    }
}