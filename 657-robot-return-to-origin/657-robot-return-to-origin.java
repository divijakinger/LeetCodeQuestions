class Solution {
    public boolean judgeCircle(String s) {
        int count_x = 0;
        int count_y = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)=='U'){
                count_y++;
            }else if (s.charAt(i)=='D'){
                count_y--;
            }else if (s.charAt(i)=='L'){
                count_x++;
            }else if (s.charAt(i)=='R'){
                count_x--;
            }
        }
        if (count_x == 0 && count_y==0){
            return true;
        }
        return false;
    }
}