class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        search(0,candidates,target,sub,ans);
        return ans;
        
    }
    static void search(int index,int[] nums,int target,List<Integer> ds,List<List<Integer>> ans){
        if(index == nums.length){
            if(target ==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(nums[index] <= target){
            ds.add(nums[index]);
            search(index,nums,target-nums[index],ds,ans);
            ds.remove(ds.size()-1);
        }
        search(index+1,nums,target,ds,ans);

    }
    
}