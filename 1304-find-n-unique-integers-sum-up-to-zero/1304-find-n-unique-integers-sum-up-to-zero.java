import java.util.Arrays;
class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if (n % 2 == 1) {
            n = n-1;
        }
        for (int i =0;i<n;i=i+2){
            ans[i]= i+1;
            ans[i+1] = (-1)*(i+1);
        }
        return ans;
    }
}