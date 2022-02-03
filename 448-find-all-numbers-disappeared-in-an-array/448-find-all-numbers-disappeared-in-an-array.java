class Solution {
   public List<Integer> findDisappearedNumbers(int[] nums) {
        //check, swap, move
        int i = 0;

        while (i < nums.length){
            int correct = nums[i]-1;
            if ( nums[i] != nums[correct]){
                swapArray(nums,i,correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add( index+1);
            }
        }

        return ans;

    }

    void swapArray(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}