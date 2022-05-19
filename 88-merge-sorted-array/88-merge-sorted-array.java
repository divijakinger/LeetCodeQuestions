class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k=0;
        int[] merged = new  int[m+n];
        while (i < m && j < n){
            if (nums1[i] <= nums2[j]){
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i<m){
            merged[k] = nums1[i];
            i++;
            k++;
        }

        while (j<n){
            merged[k] = nums2[j];
            j++;
            k++;
        }
        
        for (int ele = 0;ele<nums1.length;ele++){
            nums1[ele] = merged[ele];
        }
    }
}