class Solution {
    public int[] searchRange(int[] nums, int target) {

        int ans[] = {-1 , -1};
        int start = search(nums,target,true);

        ans[0] = start;

        if (ans[0] != -1){
            int end =  search(nums,target,false);
            ans[1] = end;
        }

        return ans;
    }

    // this function just returns the index value of target

    int search(int[] nums ,int target, boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while (start <= end){

            //find the middle element
            //int mid = (start + end)/2;
            //there might be a possibility that start + end will give you an error thus
            int mid = (start + (end - start)/2);
            if (target < nums[mid]){
                end = mid-1;
            }else if (target > nums[mid]){
                start = mid+1;
            } else {
                //potential answer is found
                ans =  mid;

                if (findStartIndex) {
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}