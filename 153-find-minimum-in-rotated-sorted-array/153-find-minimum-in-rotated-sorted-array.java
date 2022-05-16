class Solution {
    int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + (end - start)/2);
            // 4 cases over here
            if (mid < end && arr[mid]>arr[mid+1]){
                return arr[mid+1];
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return arr[mid];
            }
           if (arr[mid] <= arr[start]){
               end = mid-1;
           } else {
               start = mid+1;
           }
        }
        return -1;
    }
        
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        if (pivot == -1){
            return nums[0];
        }
        return pivot;
        
    }
}