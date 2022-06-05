class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer,Integer>  map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }


        for(int[] i:operations){
            int index=map.get(i[0]);
            nums[index]=i[1];
            map.put(i[1],index);
        }

        return nums;
    }
}