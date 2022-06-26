class Solution {
    public int minSubArrayLen(int k, int[] arr) {
        int ans = Integer.MAX_VALUE;
        // the sum for the window that we are considering
        int windowSum = 0;
        int windowEnd = 0;
        int windowStart = 0;

        while (windowEnd<arr.length){
            // add element to the sum
            windowSum+= arr[windowEnd];
            //check if we have collected first k elements : windowEnd = k-1
            while (windowSum>=k && windowStart<=windowEnd){
                //storing minimum
                ans = Math.min(ans,windowEnd-windowStart+1);
                // subtracting first element from the sum
                windowSum -= arr[windowStart];
                // incrementing start for next check
                windowStart++;
            }
            windowEnd++;
        }
         if(ans==Integer.MAX_VALUE) return 0;
        return ans;
    }
}