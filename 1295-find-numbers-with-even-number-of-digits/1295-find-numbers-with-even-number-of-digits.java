class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    
    boolean even(int num){
        int noOfDigits = digits(num);
        
        return noOfDigits % 2 ==0;
    }
    
    int digits(int num){
        return (int)(Math.log10(num)) + 1;
    }
}