class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        if (n==0) return ans;

        if (n<0){
            n = -1*n;
            ans = 1/x * myPow(1/x,n-1);
        }
        else {
            if(n%2!=0){
                ans = x*myPow(x*x,n/2);
            } 
            else {
                ans = myPow(x*x,n/2);
            }
                
        }

        return ans;
    }
}