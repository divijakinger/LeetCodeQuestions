class Solution {
    public int longestOnes(int[] nums, int k) {
        int counter = 0, rememberMax = 0, start = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ++counter;
            } else {
                if (k > 0) {
                    ++counter;
                    --k;
                } else {
                    rememberMax = Math.max(counter, rememberMax);
                    while (start < nums.length && nums[start] == 1) {
                        --counter;
                        ++start;
                    }
                    ++start;
                    ++k;
                    --counter;
                    --i;
                }
            }
        }
        rememberMax = Math.max(counter, rememberMax);

        return rememberMax;
    }
}