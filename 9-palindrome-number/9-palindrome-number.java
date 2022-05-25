class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int num = x;
        int reversenum = 0;
        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        if (reversenum == x){
            return true;
        }
        return false;
    }
}