class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int count = findCount(0,0,nums,target);
        return count;
    }
    int findCount(int index,int running_sum,int[] arr,int target){
        if (index== arr.length){
            if (running_sum==target){
                return 1;
            } else {
                return 0;
            }
        }

        int positive = findCount(index+1,running_sum+arr[index],arr,target);
        int negative = findCount(index+1,running_sum-arr[index],arr,target);

        return positive+negative;

    }
}