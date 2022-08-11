class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> finans = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        
        for (int i=1;i<arr.length;i++){
            
            
            min = Math.min(Math.abs(arr[i]-arr[i-1]),min);
        }
        
        for (int j=1;j<arr.length;j++){
            if (Math.abs(arr[j]-arr[j-1])==min){
                List<Integer> ans = new ArrayList<>();
                ans.add(arr[j-1]);
                ans.add(arr[j]);
                finans.add(ans);
            }
        }
        
        
        
        
        return finans;
    }
}