class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        if (nums2.length < nums1.length){
            return intersection(nums2,nums1);
        }
        
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>(nums1.length);
        for (int i:nums1){
            if (binarySearch(nums2,i)){
                list.add(i);
            }
        }
        
        
        HashSet<Integer> result = new HashSet<>(list);

        return result.stream().mapToInt(Integer::intValue).toArray();

    }
    
    boolean binarySearch(int[] arr,int target){
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
                return true;
            }
        }
        return false;
    }
}