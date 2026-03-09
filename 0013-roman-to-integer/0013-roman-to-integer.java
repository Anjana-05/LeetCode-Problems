class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int len = s.length();
        for(int i = 0 ; i < len ; i++ ){
            char c = s.charAt(i);
            switch(c){
                case 'I':
                    if(i < len - 1){
                        char next = s.charAt(i+1);
                        if(next == 'V'){
                            res += 3;
                            i++;
                        }
                        else if(next == 'X'){
                            res += 8;
                            i++;
                        }
                    }
                    res += 1;
                    break;

                case 'V':
                    res += 5;
                    break;
                
                case 'X':
                    if(i < len-1){
                        char next = s.charAt(i+1);
                        if(next == 'L'){
                            res += 30;
                            i++;
                        }
                        else if(next == 'C'){
                            res += 80;
                            i++;
                        }
                    }
                    res += 10;
                    break;

                case  'L':
                    res += 50;
                    break;

                case 'C':
                    if(i < len-1){
                        char next = s.charAt(i+1);
                        if(next == 'D'){
                            res += 300;
                            i++;
                        }
                        else if(next == 'M'){
                            res += 800;
                            i++;
                        }
                    }
                    res += 100;
                    break;

                case 'D':
                    res += 500;
                    break;

                case 'M':
                    res += 1000;
                    break;
                
                default:
                    res += 0;
            }
        }
        return res;
    }
}