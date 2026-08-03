class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();

        for(char ch : num.toCharArray()){

            while(k > 0 && sb.length() > 0 && sb.charAt(sb.length()-1) > ch){
                sb.deleteCharAt(sb.length()-1);
                k--;
            }

            sb.append(ch);
        }

        sb.setLength(sb.length()-k);

        int index = 0;
        while(index < sb.length()-1 && sb.charAt(index) == '0')
            index++;
            
        return sb.length() == 0 ? "0" : sb.substring(index);
    }
}