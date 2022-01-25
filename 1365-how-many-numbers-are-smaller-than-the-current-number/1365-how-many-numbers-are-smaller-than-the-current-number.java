class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int curr = nums[i];
            int small = 0;
            for (int j=0;j<nums.length;j++){
                if (curr>nums[j]){
                    small++;
                }
            }
            ans[i] = small;
        }
        
        return ans;
    }
}