class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = (start + (end - start)/2);
            if (arr[mid] > arr[mid+1]){
                // you are in the decreasing part of the array
                // this may be the ans but look at left
                // this is why end!=mid - 1
                end = mid;
            } else {
                // you are in the ascending part of the array
                start = mid + 1;
            }
        }
        // in the end start == end pointing to the largest element in the array
        return start;
    }
}