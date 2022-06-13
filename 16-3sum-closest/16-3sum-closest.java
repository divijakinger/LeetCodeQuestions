class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
        int i = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while (i < nums.length - 2) {
            if(i>0 && nums[i]==nums[i-1]){
                i++;
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[j] + nums[k]+nums[i];
                map.put(Math.abs(target-sum),sum);
                if (sum < target) {
                    j++;
                }
                else if (sum > target)
                    k--;
                else {
                    return sum;
                }
            }
            i++;
        }
        int minKey = Collections.min(map.keySet());
        return map.get(minKey);
    }
}