class Solution {
    public boolean isGoodArray(int[] nums) {
        int result = nums[0];
        for (int i : nums){
            result = GCD(result,i);

            if (result == 1){
                return true;
            }
        }
        return false;
        
    }
    
    int GCD(int a,int b){
        if (a==0){
            return b;
        }
        return GCD(b%a,a);
    }
    
}