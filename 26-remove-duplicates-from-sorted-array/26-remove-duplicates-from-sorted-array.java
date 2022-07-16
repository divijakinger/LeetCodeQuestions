class Solution {
    public int removeDuplicates(int[] nums) {
        int repeat=nums[0];
        int i=1;

        for(int num: nums){
            if(num!=repeat){
                repeat=num;
                nums[i++]=repeat;
            }

        }
        return i;
    }
}