class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (equalSum(nums,i)){
                return i;
            }
        }

        return -1;
    }
    boolean equalSum(int[] arr,int index){
        int lhs = 0;
        int rhs = 0;
        for (int i = 0; i < index; i++) {
            lhs += arr[i];
        }
        for (int j = index+1; j < arr.length; j++) {
            rhs+= arr[j];
        }

        if (lhs==rhs){
            return true;
        }

        return false;
    }
}