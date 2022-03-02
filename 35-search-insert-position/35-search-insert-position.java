class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = binarySearch(nums,target);
        return ans;
    }
    
    int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){

            //find the middle element
            //int mid = (start + end)/2;
            //there might be a possibility that start + end will give you an error thus
            int mid = (start + (end - start)/2);
            if (target < arr[mid]){
                end = mid-1;
            }else if (target > arr[mid]){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return end+1;
    }
}