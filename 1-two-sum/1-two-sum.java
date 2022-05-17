class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for (int j=0;j<nums.length;j++){
            Integer comp = map.get(target-nums[j]);
            if (comp!=null && comp!=j){
                return new int[]{comp,j};
            }
        }
        return new int[]{-1,-1};
    }
}