class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix[0].length-1;
        for (int[] row:matrix){
            if (target<=row[len]){
                return binarysearch(row,target);
            }
        }
        
        return false;
    }
    
    boolean binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        
        while (start<=end){
            int mid = (start + (end - start)/2);
            if (target < arr[mid]){
                end = mid-1;
            }else if (target==arr[mid]){
                return true;
            } else {
                start = mid+1;
            }
        }
        return false;
    }
}