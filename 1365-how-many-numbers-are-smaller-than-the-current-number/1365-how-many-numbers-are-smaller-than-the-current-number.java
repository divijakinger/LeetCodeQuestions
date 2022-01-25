class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];
        for(int x : nums){
            freq[x]++;
            System.out.println(freq[x]);
        }
        int sum = 0;
        for(int i=0; i<freq.length; i++){
            int temp = freq[i];
            freq[i]=sum;
            sum+=temp;
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=freq[nums[i]];
        }
        return nums;
    }
}