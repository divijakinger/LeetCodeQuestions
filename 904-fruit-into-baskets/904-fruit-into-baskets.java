class Solution {
    public int totalFruit(int[] fruits) {
        int windowStart = 0;
        int ans = 0;

        HashMap<Integer,Integer> frequencyCount = new HashMap<>();

        for (int windowEnd = 0; windowEnd < fruits.length; windowEnd++) {
            frequencyCount.put(fruits[windowEnd],frequencyCount.getOrDefault(fruits[windowEnd],0)+1);

            while (frequencyCount.size()>2){
                frequencyCount.put(fruits[windowStart],frequencyCount.get(fruits[windowStart])-1);
                if (frequencyCount.get(fruits[windowStart])==0){
                    frequencyCount.remove(fruits[windowStart]);
                }
                windowStart++;
            }
            ans = Math.max(ans,windowEnd-windowStart+1);
        }

        return ans;
    }
}