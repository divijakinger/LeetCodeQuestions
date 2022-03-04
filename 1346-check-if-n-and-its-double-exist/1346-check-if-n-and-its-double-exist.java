class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean ans = false;
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i] < 0){
                ans = binarySearch(arr,2*arr[i],0,i-1);
                if (ans == true){
                    return ans;
                }
            } else {
                ans = binarySearch(arr,2*arr[i],i+1,arr.length-1);
                if (ans == true){
                    return ans;
                }
            }
            
        }
        
        return ans;
        
    }
    
        boolean binarySearch(int[] arr,int target,int start,int end){
        
        System.out.println(target);
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
                return true;
            }
        }
        return false;
    }
}