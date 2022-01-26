class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
            list.add(index[i],nums[i]);
        int target[] = new int[list.size()];
        for(int i=0;i<list.size();i++)
            target[i]=list.get(i);
        return target;
    }
}