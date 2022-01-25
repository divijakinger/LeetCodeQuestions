class Solution {
    public int[] shuffle(int[] nums, int n) {
		int[] arr = new int[2*n];
        for (int i=0; i<n; i++)
        {
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[n+i];
        }
        return arr;
    }
}