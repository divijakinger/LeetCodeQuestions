class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length < 3)
            return list;
        Arrays.sort(nums);
        int i = 0;
        while (i <= nums.length - 3) {
            int j = i + 1;
            int k = nums.length - 1;
            int key = -nums[i];
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum < key)
                    j++;
                else if (sum > key)
                    k--;
                else {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    list.add(l);
                    while(j<k && nums[j]==nums[j+1])j++;
                    while(j<k && nums[k]==nums[k-1]) k--;
                    j++;k--;
                }
            }
            while(i<nums.length - 3 && nums[i]==nums[i+1])i++;
            i++;
        }
        return list;
    }
    
}