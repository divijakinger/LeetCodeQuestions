class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zero_count = 0;
        int[] ans = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                prod = prod*nums[i]; 
            } else {
                zero_count++;
            }
            
        }
        for (int i=0;i<nums.length;i++){
            if (zero_count == 0){
                ans[i] = prod/nums[i];
            } else if (zero_count <2) {
                if (nums[i]==0){
                    ans[i]=prod;
                }else{
                    ans[i]=0;
                }
            }
        }
        
        return ans;
    }
    
}