class Solution {
    public int arrangeCoins(int n) {
        long start = 0, end = n;
        long mid,curr;
        while (start<=end){
           mid = start + (end - start) / 2;
           curr = mid * (mid+1) / 2;
            
            if (curr == n) return (int)mid;
            
            if (n < curr) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        
        return (int)end;
    }
}