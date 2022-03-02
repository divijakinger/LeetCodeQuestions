class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for (int[] row : grid){
            ans += binarySearch(row);
        }
        
        return ans;
    }
     
    int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){

            //find the middle element
            //int mid = (start + end)/2;
            //there might be a possibility that start + end will give you an error thus
            int mid = (start + (end - start)/2);
            if (0 > arr[mid]){
                end = mid-1;
            }else if (0 <= arr[mid]){
                start = mid+1;
            } 
        }
        return arr.length-start;
    }
}