class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum+= cardPoints[i];
        }
        if (k==cardPoints.length){
            return windowSum;
        }

        int ans = windowSum;

        for (int windowLeft = k-1,windowRight=1; windowLeft >=0 && windowRight<=k; windowLeft--,windowRight++) {
            windowSum-=cardPoints[windowLeft];
            windowSum+=cardPoints[cardPoints.length-windowRight];
            ans = Math.max(ans,windowSum);
        }


        return ans;
    }
}