class Solution {
    public boolean canJump(int[] nums) {
                int curFar = 0;
        for(int i=0; i<=curFar; i++){
            curFar = Math.max(curFar, i+nums[i]);
            if(curFar >= nums.length-1) return true;
        }
        return false;
    }
}