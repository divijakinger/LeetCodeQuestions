class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int result = 0;
        while (start<end){
            int curr = Math.min(height[start], height[end])*(end-start);
            result = Math.max(result,curr);
            
            if (height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return result;
    }
}