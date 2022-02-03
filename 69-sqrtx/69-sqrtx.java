class Solution {
    public int mySqrt(int x) {
        if(x==1) {
            return 1;
        }
        int low=0, high=x-1, ans=0;
        while(low<=high) {
            long mid = low + (high-low)/2;
            if(mid*mid == x) {
                return (int)mid;
            }
            else if(mid*mid < x) {
                ans = (int)mid;
                low = (int)mid+1;
            }
            else {
                high = (int)mid-1;
            }
        }
        return ans;
    }
}