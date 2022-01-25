class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>(5);
        for (int i = 0;i<candies.length;i++){
            int curr = candies[i];
            curr = curr + extraCandies;
            if (curr >= Arrays.stream(candies).max().getAsInt()){
                ans.add(true) ;
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}